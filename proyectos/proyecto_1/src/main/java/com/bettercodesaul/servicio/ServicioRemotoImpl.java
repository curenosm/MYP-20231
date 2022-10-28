package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import com.bettercodesaul.repositorio.RepositorioOferta;
import com.bettercodesaul.repositorio.RepositorioProducto;
import com.bettercodesaul.repositorio.RepositorioUsuario;
import com.bettercodesaul.util.GeneradorOfertas;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 * Clase que simula la implementacion de un servicio remoto. Implementa la interfaz ServicioRemoto
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class ServicioRemotoImpl implements ServicioRemoto {

  private RepositorioUsuario repositorioUsuarios;
  private RepositorioProducto repositorioProductos;
  private RepositorioOferta repositorioOfertas;

  /**
   * Constructor sin parametros de la clase
   *
   * @throws RemoteException
   */
  public ServicioRemotoImpl() throws RemoteException {

    super();
    this.repositorioUsuarios = RepositorioUsuario.getInstance();
    this.repositorioProductos = RepositorioProducto.getInstance();
    this.repositorioOfertas = RepositorioOferta.getInstance();

    GeneradorOfertas generadorOfertas =
        new GeneradorOfertas(repositorioOfertas, repositorioProductos);
    generadorOfertas.simularGeneradorOfertas();
  }

  /**
   * Metodo que permite a un usuario iniciar sesion, buscando su cuenta con los datos dados
   *
   * @param username Nombre del usuario
   * @param password Contrasenia del usuario
   * @return Usuario
   */
  @Override
  public Usuario login(String username, String password) throws Exception {

    Usuario usuario = repositorioUsuarios.findByUsername(username);

    if (usuario != null) {
      if (usuario.getPassword().equals(password)) {
        return usuario;
      }

      throw new Exception("messages.error.incorrect.password");
    }

    throw new Exception("messages.error.user.not.found");
  }

  @Override
  public Collection<Producto> cargarCatalogo() throws Exception {
    return repositorioProductos.findAll();
  }

  /**
   * Metodo para realizar una compra segura de un producto desde la cuenta de un usuario
   *
   * @param usuario Usuario que desea realizar su cuenta
   * @param cuentaBancaria Cuenta de donde se desea pagar
   * @param codigoBarras Codigo que identifica al producto que se desea comprar
   * @return Producto
   */
  @Override
  public boolean compraSegura(Usuario usuario, Long cuentaBancaria, Collection<Producto> carrito)
      throws Exception {
    BigDecimal compra = new BigDecimal("0");

    if (carrito == null || carrito.size() == 0) {

      throw new Exception("messages.error.empty.shopping-cart");
    }

    for (Producto producto : carrito) {
      compra = compra.add(producto.getPrecio());
    }

    // Validacion codigo correcto
    if (usuario.getCuentaBancaria() != null) {

      if (usuario.getCuentaBancaria().equals(cuentaBancaria)) {
        if (usuario.getSaldoDisponible().compareTo(compra) >= 0) {
          BigDecimal res = usuario.getSaldoDisponible().subtract(compra);
          usuario.setSaldoDisponible(res);
          return true;
        } else {

          throw new Exception("messages.error.invalid.insuficient.money");
        }
      } else {

        throw new Exception("messages.error.invalid.account.number");
      }
    } else {

      throw new Exception("messages.error.invalid.account.number");
    }
  }

  /**
   * Metodo para realizar una compra segura de un producto desde la cuenta de un usuario
   *
   * @param usuario Usuario que desea realizar su cuenta
   * @param cuentaBancaria Cuenta de donde se desea pagar
   * @param codigoBarras Codigo que identifica al producto que se desea comprar
   * @return Producto
   */
  @Override
  public Producto seleccionarProducto(Long codigoBarras) {
    Producto compra = this.repositorioProductos.find(codigoBarras);

    if (compra == null) return null;

    if (compra.getStock() >= 1) {
      compra.setStock(compra.getStock() - 1);
    }

    return compra;
  }
}
