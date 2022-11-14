package com.bettercodesaul;

import static com.bettercodesaul.util.Printer.*;
import static com.bettercodesaul.util.PropertiesFactory.*;

import com.bettercodesaul.modelos.Oferta;
import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import com.bettercodesaul.servicio.ServicioClienteImpl;
import com.bettercodesaul.util.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase para correr el resto del proyecto e interactuar con el usuario
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Main {

  private static Scanner scanner = new Scanner(System.in);
  private static int contador;

  public static void main(String[] args) throws Exception {
    success(property("version"));
    startClient();
  }

  /**
   * Metodo para iniciar la version del programa para un cliente
   *
   * @throws Exception
   */
  public static void startClient() throws Exception {

    ServicioClienteImpl servicio = new ServicioClienteImpl();
    Usuario usuario = null;

    do {
      warning("Escribe 'exit' para salir");
      bold(property("messages.client"));

      try {
        info("Username: ");
        String username = scanner.nextLine();
        if (username.equals("exit")) {
          System.exit(0);
        }
        info("Password: ");
        String password = scanner.nextLine();

        usuario = servicio.login(username, password);

      } catch (NumberFormatException e) {
        error(property("messages.error.invalid.option"));
        scanner.nextLine();
      } catch (Exception e) {
        error(property(e.getMessage()));
        scanner = new Scanner(System.in);
      }
    } while (usuario == null);

    // Registramos al usuario como observador del repositorio de ofertas para
    // que si una nueva surja, este sea notificado

    Properties messages = PropertiesFactory.loadMessages(usuario.getCodigoPais());

    success(messages.getProperty("messages.welcome"));

    int opcionMenuWelcome = -1;
    ArrayList<Producto> carrito = new ArrayList<Producto>();
    do {

      success(messages.getProperty("messages.welcome.menu"));

      try {
        opcionMenuWelcome = scanner.nextInt();

        switch (opcionMenuWelcome) {
          case 0:
            success(messages.getProperty("messages.goodbye"));
            opcionMenuWelcome = 0;
            break;
          case 1:
            clearScreen();

            success(servicio.obtenerCatalogo());
            break;
          case 2:
            clearScreen();
            success(messages.getProperty("messages.shop.menu"));
            warning(servicio.obtenerCatalogo());

            Producto compra = comprarProducto(servicio, messages);
            carrito.add(compra);
            success(messages.getProperty("messages.success.buy") + compra.getNombre());

            break;
          case 3:
            success(messages.getProperty("messages.shop.offers"));
            if (usuario.getOfertasDisponibles().size() == 0) {
              warning(messages.getProperty("messages.error.unavailable.offers"));
            }
            usuario.getOfertasDisponibles().forEach(t -> warning(t.toString()));
            break;
          case 4:
            success(messages.getProperty("messages.shop"));
            System.out.println("Compra segura");
            boolean ok = comprarProductoSeguro(servicio, messages, usuario, carrito);
            if (ok) {
              String fecha = generarFecha(usuario);
              BigDecimal costo = new BigDecimal("0");
              for (Producto producto : carrito) {
                Producto copia = (Producto) producto.clone();
                for (Oferta oferta : usuario.getOfertasDisponibles()) {
                  if (oferta.getProducto().getNombre().equals(copia.getNombre())) {
                    copia.setPrecio(
                        copia
                            .getPrecio()
                            .subtract(oferta.getPorcentajeDescuento().multiply(copia.getPrecio())));
                    break;
                  }
                }
                costo = costo.add(copia.getPrecio());
                bold(copia.toString());
              }
              warning(messages.getProperty("messages.product.cost") + costo);
              info(
                  messages.getProperty("messages.success.final.buy")
                      + usuario.getSaldoDisponible()
                      + "\n"
                      + messages.getProperty("messages.date")
                      + fecha);
              success(messages.getProperty("messages.goodbye"));
              carrito.clear();
              opcionMenuWelcome = 0;
            }

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
    scanner.nextLine();
    startClient();
  }

  /**
   * Metodo para completar la compra de forma segura
   *
   * @param servicio instancia de ServicioClienteImpl
   * @param messages Instancia de Properties
   * @param usuario Instancia de la clase usuario (el que usa el servicio actualmente)
   * @param carrito Coleccion de instancias de la clase Producto
   * @return boolean
   * @throws Exception
   */
  public static boolean comprarProductoSeguro(
      ServicioClienteImpl servicio,
      Properties messages,
      Usuario usuario,
      Collection<Producto> carrito)
      throws Exception {

    Long cuentaBancaria = 0L;
    if (carrito.isEmpty()) {
      warning(messages.getProperty("messages.error.empty.shopping-cart"));
      return false;
    }

    do {
      warning(messages.getProperty("messages.bank.account"));
      try {
        cuentaBancaria = scanner.nextLong();
        break;
      } catch (Exception e) {
        error(e.getMessage());
        scanner = new Scanner(System.in);
      }

    } while (true);

    boolean aprobado = false;

    try {
      aprobado = servicio.compraSegura(usuario, cuentaBancaria, carrito);
    } catch (Exception e) {
      error(messages.getProperty(e.getMessage()));
      if (e.getMessage().equals("messages.error.invalid.account.number")) {
        contador++;
        if (contador >= 2) {
          error(messages.getProperty("messages.error.security"));
          System.exit(0);
        }
      } else if (e.getMessage().equals("messages.error.invalid.insuficient.money")) {
        carrito.clear();
      }
    }
    return aprobado;
  }

  /**
   * Metodo para agregar un producto al carrito de compra
   *
   * @param servicio Instancia de la clase ServicioClienteImpl
   * @param messages Instancia de Properties
   * @return Producto
   * @throws Exception
   */
  public static Producto comprarProducto(ServicioClienteImpl servicio, Properties messages)
      throws Exception {
    Long resp = 0L;

    do {
      warning(messages.getProperty("messages.buy.product"));

      try {
        resp = scanner.nextLong();

      } catch (Exception e) {
        error(e.getMessage());
        scanner = new Scanner(System.in);
      }

      Producto productoElegido = null;

      productoElegido = servicio.comprarProducto(resp);

      if (productoElegido != null) {
        return productoElegido;
      }

    } while (true);
  }

  /**
   * Metodo para generar un fecha aleatoria pero con sentido
   *
   * @return String
   */
  public static String generarFecha(Usuario usuario) {
    Random rand = new Random();
    int dias = rand.nextInt(30);

    int mes = 0;
    if (dias % 3 == 0 || dias % 3 == 0 || dias % 7 == 0) {
      mes = 11;
    } else {
      mes = 12;
    }
    int anio = 2022;
    if (usuario.getCodigoPais().equals("en_US")) {
      return mes + "/" + dias + "/" + anio;
    } else {
      return dias + "/" + mes + "/" + anio;
    }
  }
}
