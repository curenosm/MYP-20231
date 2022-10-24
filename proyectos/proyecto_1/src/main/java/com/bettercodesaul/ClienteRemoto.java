package com.bettercodesaul;

import com.bettercodesaul.modelos.*;
import com.bettercodesaul.servicio.ServicioRemoto;
import java.rmi.Naming;

public class ClienteRemoto {
  private Catalogo catalogo = new Catalogo();

  public String obtenerCatalogo() {
    String catalogo = null;

    try {
      ServicioRemoto servicio = (ServicioRemoto) Naming.lookup("rmi://127.0.0.1/RemoteHello");
      catalogo = servicio.sayHello();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return catalogo;
  }

  public String obtenerCatalogo2() {
    String menuCatalogo = this.catalogo.mostrarCatalogo();

    try {
      ServicioRemoto servicio = (ServicioRemoto) Naming.lookup("rmi://127.0.0.1/RemoteHello");
      // catalogo = servicio.sayHello();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return menuCatalogo;
  }
}
