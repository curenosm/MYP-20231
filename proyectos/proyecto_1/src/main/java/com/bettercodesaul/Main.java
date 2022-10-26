package com.bettercodesaul;

import static com.bettercodesaul.util.Printer.*;
import static com.bettercodesaul.util.PropertiesFactory.*;

import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import com.bettercodesaul.servicio.ServicioClienteImpl;
import com.bettercodesaul.util.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    success(property("version"));
    startClient();
  }

  public static void startClient() throws Exception {

    ServicioClienteImpl servicio = new ServicioClienteImpl();
    Usuario usuario = null;

    do {
      bold(property("messages.client"));

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

    startClient();
  }

  public static Producto comprarProducto(
      ServicioClienteImpl servicio, Properties messages, Usuario usuario) throws Exception {
    Long resp = 0L;
    warning(messages.getProperty("messages.buy.product"));

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
      productoElegido = servicio.comprarProducto(usuario, cuentaBancaria, resp);

      if (productoElegido != null) {
        return productoElegido;
      }

    } while (true);
  }
}
