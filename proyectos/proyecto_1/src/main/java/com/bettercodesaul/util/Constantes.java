package com.bettercodesaul.util;

import com.bettercodesaul.Main;
import java.io.IOException;
import java.io.InputStream;
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

  static {
    properties = loadProperties();
  }

  /**
   * Metodo que carga el archivo application.properties que esta en la raiz de la practica.
   *
   * @return objeto de propiedades
   */
  public static Properties loadProperties() {

    InputStream input = Main.class.getResourceAsStream("/application.properties");

    try {
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
   * * Metodo para redondear decimales
   *
   * @param cantidad Cantidad a redondear
   * @return double
   */
  public static double redondear(double cantidad) {
    return Math.floor(cantidad * 100) / 100;
  }

  /**
   * Metodo para repetir un caracter dado un cierto numero de veces
   *
   * @param c Caracter a repetir
   * @param n Numero de veces
   * @return
   */
  public static String repeat(char c, int n) {
    return (n > 0) ? c + repeat(c, n - 1) : "";
  }

  /**
   * Metodo para repetir una cadena un cierto numero de veces
   *
   * @param c Cadena a repetir
   * @param n Numero de veces
   * @return
   */
  public static String repeat(String s, int n) {
    return (n > 0) ? s + repeat(s, n - 1) : "";
  }
}
