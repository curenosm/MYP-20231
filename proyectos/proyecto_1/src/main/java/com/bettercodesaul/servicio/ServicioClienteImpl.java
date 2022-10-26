package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.*;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 * Clase que simula un servicio al cliente implementado. Implementa la interfax ServicioCliente
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class ServicioClienteImpl implements ServicioCliente {

  private ServicioRemoto servicio;

  /**
   * Constructor sin parametros de la clases
   * @throws RemoteException
   */
  public ServicioClienteImpl() throws RemoteException {
    servicio = new ServicioRemotoImpl();
  }

  /**
   * Metodo para obtener una representacion del catalogo de productos
   * @return String
   */
  public String obtenerCatalogo() {

    String menuCatalogo = "";

    try {
      Collection<Producto> productos = servicio.cargarCatalogo();

      for (Producto p : productos) {
        menuCatalogo += p.toString();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    return menuCatalogo;
  }

  /**
   * Metodo para realizar la compra de un producto
   * @param codigo Codigo del producto a comprar
   * @return Producto
   */
  public Producto comprarProducto(Long codigo) {
    Producto producto = null;

    try {
      producto = servicio.compraSegura(codigo);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return producto;
  }

  /**
   * Metodo que permite a un usuario iniciar sesion
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
}
