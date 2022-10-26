package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Oferta;
import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import com.bettercodesaul.repositorio.RepositorioOferta;
import com.bettercodesaul.repositorio.RepositorioProducto;
import com.bettercodesaul.repositorio.RepositorioUsuario;
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
   * @throws RemoteException
   */
  public ServicioRemotoImpl() throws RemoteException {
    super();
    this.repositorioUsuarios = RepositorioUsuario.getInstance();
    this.repositorioProductos = RepositorioProducto.getInstance();
    this.repositorioOfertas = RepositorioOferta.getInstance();
    simularGeneradorOfertas();
  }

  /**
   * Metodo que permite a un usuario iniciar sesion, buscando su cuenta con los datos dados
   * @param username Nombre del usuario
   * @param password Contrasenia del usuario
   * @return Usuario
   */
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

  /**
   * Metodo que carga los productos del catalogo
   * @return Collecio<Producto>
   */
  // @Override
  public Collection<Producto> cargarCatalogo() throws RemoteException, InterruptedException {
    return repositorioProductos.findAll();
  }

  /**
   * Metodo para realizar una compra segura de un producto
   * @param codigoBarras Codigo que identifica al producto que se desea comprar
   * @return Producto
   */
  public Producto compraSegura(Long codigoBarras) throws RemoteException, InterruptedException {
    Producto compra = this.repositorioProductos.find(codigoBarras);
    return compra;
  }

  /**
   * Metodo para realizar una compra segura de un producto desde la cuenta de un usuario
   * @param usuario Usuario que desea realizar su cuenta
   * @param cuentaBancaria Cuenta de donde se desea pagar
   * @param codigoBarras Codigo que identifica al producto que se desea comprar
   * @return Producto
   */
  // @Override
  public Producto compraSegura(Usuario usuario, Long cuentaBancaria, Long codigoBarras)
      throws RemoteException, InterruptedException {
    Producto compra = this.repositorioProductos.find(codigoBarras);

    // Validacion codigo correcto
    if (usuario.getCuentaBancaria() != null) {
      // TODO: Validacion dinero suficiente

    } else {

    }

    return compra;
  }

  /**
   * Metodo que genera ofertas aleatorias cada determinado tiempo
   */
  public void simularGeneradorOfertas() {
    new Thread(
            () -> {
              // run background code here
              do {
                try {
                  Thread.sleep(20 * 1000);

                  Oferta oferta = new Oferta();
                  repositorioOfertas.save(oferta);

                  System.out.println("Oferta generada");
                } catch (InterruptedException e) {
                }

              } while (true);
            })
        .start();
  }
}
