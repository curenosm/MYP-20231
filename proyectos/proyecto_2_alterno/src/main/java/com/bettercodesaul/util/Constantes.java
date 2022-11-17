package com.bettercodesaul.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Clase que almacena las constantes utilizadas para la practica
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Constantes {

  private static Properties properties;

  static {
    properties = loadProperties();
  }

  /**
   * Metodo que carga el archivo application.properties que esta en la raiz de la practica.
   *
   * @return objeto de propiedades
   */
  public static Properties loadProperties() {

    try (InputStream input = new FileInputStream("src/main/resources/application.properties")) {
      Properties prop = new Properties();
      prop.load(input);
      return prop;
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    return null;
  }

  /**
   * Metodo para obtener un mensaje especifico del archivo application.properties de acuerdo a su
   * nombre
   *
   * @param propertyName NOmbre del mensaje que se desea obtener
   * @return String
   */
  public static String property(String propertyName) {
    return properties.getProperty(propertyName);
  }

  /**
   * Metodo para generar un numero aleatorio
   *
   * @param startInclusive Desde que numero se generan los aleatorios
   * @param endExclusive Hasta que numero se generan (excluye tal numero de los generados)
   * @return
   */
  public static int random(int startInclusive, int endExclusive) {
    return (int) (Math.random() * endExclusive + startInclusive);
  }
}
