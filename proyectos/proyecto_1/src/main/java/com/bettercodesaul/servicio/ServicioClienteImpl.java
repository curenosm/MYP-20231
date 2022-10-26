package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.*;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 * Clase que simula la implementacion del servicio del cliente. Implementa la interfax
 * ServicioCliente
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class ServicioClienteImpl implements ServicioCliente {

  private ServicioRemoto servicio;

  /**
   * Constructor sin parametros de la clases
   *
   * @throws RemoteException
   */
  public ServicioClienteImpl() throws RemoteException {
    servicio = new ServicioRemotoImpl();
  }

  /**
   * Metodo para obtener una representacion del catalogo de productos
   *
   * @return String
   */
  public String obtenerCatalogo() throws Exception {

    String menuCatalogo = "";
    Collection<Producto> productos = servicio.cargarCatalogo();

    for (Producto p : productos) {
      menuCatalogo += p.toString();
    }

    return menuCatalogo;
  }

  /**
   * Metodo que permite a un usuario iniciar sesion
   *
   * @param username Nombre del usuario
   * @param password Contrasenia del usuario
   * @return Usuario
   */
  public Usuario login(String username, String password) {
    Usuario usuario = null;

    try {
      usuario = servicio.login(username, password);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return usuario;
  }

  /**
   * Metodo para realizar la compra de un producto desde la cuenta de un usuario
   *
   * @param usuario Instancia de la clase Usuario
   * @param cuentaBancaria Cuenta asociada al usuario
   * @param codigo Codigo del producto a comprar
   * @return Producto
   */
  public Producto comprarProducto(Usuario usuario, Long cuentaBancaria, Long codigoBarras)
      throws Exception {
    return servicio.compraSegura(usuario, cuentaBancaria, codigoBarras);
  }
}
