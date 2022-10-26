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

  public Producto comprarProducto(Usuario usuario, Long cuentaBancaria, Long codigoBarras)
      throws Exception {
    return servicio.compraSegura(usuario, cuentaBancaria, codigoBarras);
  }

  public Usuario login(String username, String password) throws Exception {
    return servicio.login(username, password);
  }
}
