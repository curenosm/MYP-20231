package main.java.p03.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

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
          "Cebolla",
          "Catsup",
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

  public static String property(String propertyName) {
    return properties.getProperty(propertyName);
  }

  public static double redondear(double cantidad) {
    return Math.floor(cantidad * 100) / 100;
  }
}
