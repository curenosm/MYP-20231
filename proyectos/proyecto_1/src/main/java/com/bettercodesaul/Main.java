package com.bettercodesaul;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

public class Main {
  public static void main(String[] args) {
    success(property("version"));

    if (args.length != 0) {
      if (args[0] != null)
        if (args[0].equals("server")) startServer();
        else startClient();
    } else {
      startClient();
    }

  }

  public static void startClient() {
    info("Cliente iniciado");
  }

  public static void startServer() {
    info("Servidor iniciado");
  }
}
