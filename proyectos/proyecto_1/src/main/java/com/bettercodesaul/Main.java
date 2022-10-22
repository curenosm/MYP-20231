package com.bettercodesaul;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

import com.bettercodesaul.util.*;
import java.rmi.Naming;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    success(property("version"));

    if (args.length != 0) {
      if (args[0].equals("server")) {
        startServer();
      } else startClient();
    } else {
      error("Ingrese como primer parametro que quiere ejecutar (client/server)");
    }
  }

  public static void startClient() {
    info("Cliente iniciado");

    try {
      ServicioRemoto servicio = new ServicioRemotoCargarCatalogo();
      Naming.rebind("RemoteHello", servicio);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void startServer() {
    info("Servidor iniciado");

    try {
      List<String> catalogo = ReadFile.readUsingBufferedReader("/catalogo.txt");
      catalogo.forEach(System.out::println);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
