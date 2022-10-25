package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.*;
import java.rmi.RemoteException;
import java.util.Collection;

public class ServicioClienteImpl implements ServicioCliente {

  private ServicioRemoto servicio;

  public ServicioClienteImpl() throws RemoteException {
    servicio = new ServicioRemotoImpl();
  }

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

  public Producto comprarProducto(Long codigo) {
    Producto producto = null;

    try {
      producto = servicio.compraSegura(codigo);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return producto;
  }

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
