package main.java.p03.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import main.java.p03.pizzas.*;
import main.java.p03.waysub.*;

/**
 * Clase que almacena las constantes utilizadas para la practica
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Constantes {

  private static Properties properties;
  public static Scanner scanner = new Scanner(System.in);
  public static final List<String> INGREDIENTES_BAGUETTE =
      List.of(
          "Catsup",
          "Cebolla",
          "Jamon",
          "Jitomate",
          "Lechuga",
          "Mayonesa",
          "Mostaza",
          "Pepperoni",
          "Pollo");

  static {
    properties = loadProperties();
  }

  // Pizzas del menu que se pueden pedir
  public static List<Pizza> menuPizzas =
      List.of(
          new PizzaAmericana(),
          new PizzaRelax(),
          new PizzaSalchicha(),
          new PizzaChicken(),
          new PizzaCuriosa());

  /**
   * Metodo que carga el archivo application.properties que esta en la raiz de la practica.
   *
   * @return objeto de propiedades
   */
  public static Properties loadProperties() {

    try (InputStream input = new FileInputStream("./main/resources/application.properties")) {
      Properties prop = new Properties();
      prop.load(input);
      return prop;
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    return null;
  }

  /**
   * Metodo para obtener un mensaje especifico del archivo application.properties de acuerdo a su nombre
   * @param propertyName NOmbre del mensaje que se desea obtener
   * @return String
   */
  public static String property(String propertyName) {
    return properties.getProperty(propertyName);
  }

  /***
   * Metodo para redondear decimales
   * @param cantidad Cantidad a redondear
   * @return double
   */
  public static double redondear(double cantidad) {
    return Math.floor(cantidad * 100) / 100;
  }

  /**
   * Metodo para pedir una pizza de las opciones del menu. Se usa un PizzaAdapter para que la pizza
   * se comporte como Baguette.
   *
   * @return Baguette
   */
  public static Baguette pedirPizza() {
    int resp = 0;
    boolean bobo = false;
    Pizza pizza = new PizzaAmericana();
    do {
      try {
        Printer.bold(property("menu.pizza.opciones"));
        resp = scanner.nextInt();

        switch (resp) {
          case 1:
            pizza = menuPizzas.get(0);
            bobo = false;
            break;

          case 2:
            pizza = menuPizzas.get(1);
            bobo = false;
            break;

          case 3:
            pizza = menuPizzas.get(2);
            bobo = false;
            break;

          case 4:
            pizza = menuPizzas.get(3);
            bobo = false;
            break;

          case 5:
            pizza = menuPizzas.get(4);
            bobo = false;
            break;

          default:
            Printer.error(property("error.opcion.incorrecta"));
            break;
        }
      } catch (Exception e) {
        scanner.nextLine();
      }
    } while (bobo == true);

    PizzaAdapter baguettePizza = new PizzaAdapter(pizza);
    return baguettePizza;
  }

  /**
   * Metodo para agregar ingredientes a los panes
   *
   * @param pedido instancia de la clase Baguette a la que se le aniadieran cosas
   * @return Baguette
   */
  public static Baguette agregarIngredientes(Baguette pedido) {
    boolean bobo = true;
    int resp = 0, ingrediente = 0;

    do {
      Printer.bold("Elija el ingrediente que desea agregar");
      Printer.bold(property("menu.baguette.ingredientes"));
      try {
        resp = scanner.nextInt();

        switch (resp) {
          case 1:
            if (pedido.puedoAgregarIngrediente(INGREDIENTES_BAGUETTE.get(0))) {
              pedido = new Catsup(pedido);
            } else {
              Printer.error(property("menu.baguette.error"));
            }
            bobo = false;
            break;

          case 2:
            if (pedido.puedoAgregarIngrediente(INGREDIENTES_BAGUETTE.get(1))) {
              pedido = new Cebolla(pedido);
            } else {
              Printer.error(property("menu.baguette.error"));
            }
            bobo = false;
            break;

          case 3:
            if (pedido.puedoAgregarIngrediente(INGREDIENTES_BAGUETTE.get(2))) {
              pedido = new Jamon(pedido);
            } else {
              Printer.error(property("menu.baguette.error"));
            }
            bobo = false;
            break;

          case 4:
            if (pedido.puedoAgregarIngrediente(INGREDIENTES_BAGUETTE.get(3))) {
              pedido = new Jitomate(pedido);
            } else {
              Printer.error(property("menu.baguette.error"));
            }
            bobo = false;
            break;

          case 5:
            if (pedido.puedoAgregarIngrediente(INGREDIENTES_BAGUETTE.get(4))) {
              pedido = new Lechuga(pedido);
            } else {
              Printer.error(property("menu.baguette.error"));
            }
            bobo = false;
            break;

          case 6:
            if (pedido.puedoAgregarIngrediente(INGREDIENTES_BAGUETTE.get(5))) {
              pedido = new Mayonesa(pedido);
            } else {
              Printer.error(property("menu.baguette.error"));
            }
            bobo = false;
            break;

          case 7:
            if (pedido.puedoAgregarIngrediente(INGREDIENTES_BAGUETTE.get(6))) {
              pedido = new Mostaza(pedido);
            } else {
              Printer.error(property("menu.baguette.error"));
            }
            bobo = false;
            break;

          case 8:
            if (pedido.puedoAgregarIngrediente(INGREDIENTES_BAGUETTE.get(7))) {
              pedido = new Pepperoni(pedido);
            } else {
              Printer.error(property("menu.baguette.error"));
            }
            bobo = false;
            break;

          case 9:
            if (pedido.puedoAgregarIngrediente(INGREDIENTES_BAGUETTE.get(8))) {
              pedido = new Pollo(pedido);
            } else {
              Printer.error(property("menu.baguette.error"));
            }
            bobo = false;
            break;

          default:
            Printer.error(property("error.opcion.incorrecta"));
            break;
        }
      } catch (Exception e) {
        scanner.nextLine();
        Printer.error(property("error.opcion.incorrecta"));
      }
    } while (bobo == true);
    return pedido;
  }
}
