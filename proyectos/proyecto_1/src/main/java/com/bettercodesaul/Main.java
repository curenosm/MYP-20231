package com.bettercodesaul;

import static com.bettercodesaul.util.Printer.*;
import static com.bettercodesaul.util.PropertiesFactory.*;

import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import com.bettercodesaul.servicio.ServicioClienteImpl;
import com.bettercodesaul.util.*;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws RemoteException {
    success(property("version"));
    System.out.println("Prueba");

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

    ServicioClienteImpl servicio = new ServicioClienteImpl();

    Usuario usuario = null;
    do {

      try {
        info("Username: ");
        String username = scanner.nextLine();

        info("Password: ");
        String password = scanner.nextLine();

        usuario = servicio.login(username, password);

      } catch (NumberFormatException e) {
        error(property("messages.error.invalid.option"));
        scanner.nextLine();
      } catch (Exception e) {
        error(property("messages.error.invalid.option"));
        scanner = new Scanner(System.in);
      }

    } while (usuario == null);

    // Registramos al usuario como observador del repositorio de ofertas para
    // que si una nueva surja, este sea notificado

    Properties messages = PropertiesFactory.loadMessages(usuario.getCodigoPais());

    success(messages.getProperty("messages.welcome"));
    success(messages.getProperty("messages.welcome.menu"));

    int opcionMenuWelcome = -1;
    ArrayList<Producto> carrito = new ArrayList<Producto>();
    do {
      try {
        opcionMenuWelcome = Integer.parseInt(scanner.nextLine());

        switch (opcionMenuWelcome) {
          case 0:
            success(messages.getProperty("messages.goodbye"));
            System.exit(0);
            break;
          case 1:
            success(messages.getProperty("messages.shop.menu"));
            warning(servicio.obtenerCatalogo());

            Producto compra = comprarProducto(servicio, messages, usuario);
            carrito.add(compra);
            success(messages.getProperty("messages.success.buy" + compra.getNombre()));
            break;
          case 2:
            success(messages.getProperty("messages.shop.offers"));
            usuario.getOfertasDisponibles().forEach(t -> warning(t.toString()));
            break;
          case 3:
            success(messages.getProperty("messages.shop"));
            break;
          default:
            error(messages.getProperty("messages.error.invalid.option"));
            throw new Exception();
        }

      } catch (NumberFormatException e) {
        error(messages.getProperty("messages.error.invalid.option"));
      } catch (Exception e) {
        error(property("messages.error.invalid.option"));
        scanner = new Scanner(System.in);
      }
    } while (opcionMenuWelcome != 0);

    System.exit(0);
  }

  public static void startServer() {
    bold(property("messages.server"));

    try {
      List<String> catalogo = ReadFile.readUsingBufferedReader("/catalogo.bat");
      catalogo.forEach(System.out::println);
    } catch (Exception e) {

    }
  }

  public static Producto comprarProducto(
      ServicioClienteImpl servicio, Properties messages, Usuario usuario) throws Exception {

    Scanner scanner = new Scanner(System.in);
    Long resp = 0L;
    warning(messages.getProperty("messages.buy.product"));
    // resp = scanner.nextInt();

    // TODO: Solicitar cuenta bancaria
    Long cuentaBancaria = 1L;

    // MOSTRAR CATALOGO
    do {

      try {
        resp = scanner.nextLong();
        System.out.println(resp);
      } catch (Exception e) {
        error(e.getMessage());
        scanner = new Scanner(System.in);
      }

      Producto productoElegido = null;
      try {
        productoElegido = servicio.comprarProducto(usuario, cuentaBancaria, resp);
        System.out.println("productoElegido " + productoElegido);
      } catch (Exception e) {
        scanner = new Scanner(System.in);
      }

      if (productoElegido != null) {
        return productoElegido;
      }

    } while (true);
  }
}
