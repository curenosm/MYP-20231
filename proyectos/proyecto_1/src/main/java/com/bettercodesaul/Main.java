package com.bettercodesaul;

import static com.bettercodesaul.util.Printer.*;
import static com.bettercodesaul.util.PropertiesFactory.*;

import com.bettercodesaul.modelos.Usuario;
import com.bettercodesaul.servicio.ServicioRemoto;
import com.bettercodesaul.servicio.ServicioRemotoImpl;
import com.bettercodesaul.util.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws RemoteException {
    success(property("version"));

    if (args.length != 0) {
      if (args[0].equals("server")) {
        startServer();
      } else startClient();
    } else {
      error(property("messages.error.mode.unselected"));
    }
  }

  public static void startClient() throws RemoteException {
    bold(property("messages.client"));

    ServicioRemoto servicioRemoto = new ServicioRemotoImpl();
    ClienteRemoto cliente = new ClienteRemoto();

    Usuario usuario = null;
    do {

      try {
        info("Username: ");
        String username = scanner.nextLine();

        info("Password: ");
        String password = scanner.nextLine();

        usuario = servicioRemoto.login(username, password);

      } catch (RemoteException e) {
        error(property("messages.error.remote"));
      } catch (InterruptedException e) {
        error(property("messages.error.interrupted"));
      } catch (NumberFormatException e) {
        error(property("messages.error.invalid.option"));
        scanner.nextLine();
      } catch (Exception e) {
        error(property("messages.error.invalid.option"));
        scanner = new Scanner(System.in);
      }

    } while (usuario == null);

    Properties messages = PropertiesFactory.loadMessages(usuario.getCodigoPais());

    success(messages.getProperty("messages.welcome"));
    success(messages.getProperty("messages.welcome.menu"));

    int opcionMenuWelcome = -1;
    do {
      try {
        opcionMenuWelcome = Integer.parseInt(scanner.nextLine());

        switch (opcionMenuWelcome) {
          case 0:
            success(messages.getProperty("messages.goodbye"));
            System.exit(0);
            break;
          case 1:
            System.out.println("Pruweba");
            success(messages.getProperty("messages.shop.menu"));
            warning(cliente.obtenerCatalogo2());
            System.out.println("Pruweba");
            // System.exit(0);
            break;
          default:
            error(property("messages.error.invalid.option"));
            throw new Exception();
        }

      } catch (NumberFormatException e) {
        error(messages.getProperty("messages.error.invalid.option"));
      } catch (Exception e) {
        error(property("messages.error.invalid.option"));
        scanner = new Scanner(System.in);
      }
    } while (opcionMenuWelcome != 0);

    try {
      ServicioRemoto servicio = new ServicioRemotoImpl();
      Naming.rebind("RemoteHello", servicio);
    } catch (MalformedURLException e) {
      error(messages.getProperty("messages.error.wrong.url"));
    } catch (RemoteException e) {
      error(messages.getProperty("messages.error.remote"));
    }

    System.exit(0);
  }

  public static void startServer() {
    bold(property("messages.server"));

    try {
      List<String> catalogo = ReadFile.readUsingBufferedReader("/catalogo.bat");
      catalogo.forEach(System.out::println);
    } catch (Exception e) {

    }
    warning(cliente.obtenerCatalogo2());
  }
}
