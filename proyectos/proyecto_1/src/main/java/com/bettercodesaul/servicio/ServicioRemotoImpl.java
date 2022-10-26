package com.bettercodesaul.servicio;

import static com.bettercodesaul.util.PropertiesFactory.*;

import com.bettercodesaul.modelos.Oferta;
import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import com.bettercodesaul.repositorio.RepositorioOferta;
import com.bettercodesaul.repositorio.RepositorioProducto;
import com.bettercodesaul.repositorio.RepositorioUsuario;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Collection;

public class ServicioRemotoImpl implements ServicioRemoto {

  private RepositorioUsuario repositorioUsuarios;
  private RepositorioProducto repositorioProductos;
  private RepositorioOferta repositorioOfertas;

  public ServicioRemotoImpl() throws RemoteException {
    super();
    this.repositorioUsuarios = RepositorioUsuario.getInstance();
    this.repositorioProductos = RepositorioProducto.getInstance();
    this.repositorioOfertas = RepositorioOferta.getInstance();
    simularGeneradorOfertas();
  }

  @Override
  public Usuario login(String username, String password)
      throws RemoteException, InterruptedException {

    Usuario usuario = repositorioUsuarios.findByUsername(username);

    if (usuario != null) {
      if (usuario.getPassword().equals(password)) {
        return usuario;
      }

      usuario = null;
    }

    return usuario;
  }

  @Override
  public Collection<Producto> cargarCatalogo() throws RemoteException, InterruptedException {
    return repositorioProductos.findAll();
  }

  @Override
  public Producto compraSegura(Usuario usuario, Long cuentaBancaria, Long codigoBarras)
      throws Exception {
    Producto compra = this.repositorioProductos.find(codigoBarras);

    if (compra == null) return null;

    // Validacion codigo correcto
    if (usuario.getCuentaBancaria() != null) {
      if (usuario.getCuentaBancaria().equals(cuentaBancaria)) {
        if (usuario.getSaldoDisponible().compareTo(compra.getPrecio()) <= 0) {
          BigDecimal res = usuario.getSaldoDisponible().subtract(compra.getPrecio());
          usuario.setSaldoDisponible(res);
          return compra;
        } else {
          throw new Exception(property("messages.error.invalid.insuficient.money"));
        }
      } else {
        throw new Exception(property("messages.error.invalid.account.number"));
      }
    } else {
      throw new Exception("messages.error.invalid.account.number");
    }
  }

  public void simularGeneradorOfertas() {
    new Thread(
            () -> {
              // run background code here
              do {
                try {
                  Thread.sleep(20 * 1000);

                  Oferta oferta = new Oferta();
                  oferta.setCodigoPaisOferta("");
                  repositorioOfertas.save(oferta);

                  System.out.println("Oferta generada");
                } catch (InterruptedException e) {
                }

              } while (true);
            })
        .start();
  }
}
