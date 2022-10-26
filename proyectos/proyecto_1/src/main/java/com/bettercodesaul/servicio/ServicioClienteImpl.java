package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.*;
import java.util.Collection;

public class ServicioClienteImpl implements ServicioCliente {

  private ServicioRemoto servicio;

  public ServicioClienteImpl() {
    servicio = new ServicioRemotoImpl();
  }

  public String obtenerCatalogo() throws Exception {

    String menuCatalogo = "";
    Collection<Producto> productos = servicio.cargarCatalogo();

    for (Producto p : productos) {
      menuCatalogo += p.toString();
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
