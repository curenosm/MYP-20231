package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.*;

import java.rmi.Naming;
import java.util.Collection;

public class ServicioClienteImpl implements ServicioCliente {

  public static final String URL_LOGIN = "rmi://127.0.0.1/Login";
  public static final String URL_GET_CATALOGO = "rmi://127.0.0.1/ObtenerProductos";
  public static final String URL_COMPRAR_PRODUCTO = "rmi://127.0.0.1/ComprarProducto";

  public String obtenerCatalogo() {

    String menuCatalogo = "";

    try {
      ServicioRemoto servicio = (ServicioRemoto) Naming.lookup(URL_GET_CATALOGO);
      Collection<Producto> productos = servicio.cargarCatalogo();

      for (Producto p : productos) {
        menuCatalogo += p.toString();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    return menuCatalogo;
  }

  public Producto comprarProducto(Long codigo) {
    Producto producto = null;

    try {
      ServicioRemoto servicio = (ServicioRemoto) Naming.lookup(URL_COMPRAR_PRODUCTO);
      producto = servicio.compraSegura(codigo);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return producto;
  }

  public Usuario login(String username, String password) {
    Usuario usuario = null;

    try {
      ServicioRemoto servicio = (ServicioRemoto) Naming.lookup(URL_LOGIN);
      usuario = servicio.login(username, password);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return usuario;
  }
}
