package com.bettercodesaul.util;

import com.bettercodesaul.Main;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFactory {

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
   * Metodo que carga el archivo application.properties que esta en la raiz de la practica.
   *
   * @return objeto de propiedades
   */
  public static Properties loadMessages(String countryCode) {

    String path = "/messages-" + countryCode + ".properties";

    InputStream input = Main.class.getResourceAsStream(path);

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
}
