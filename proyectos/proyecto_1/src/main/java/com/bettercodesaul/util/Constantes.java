package com.bettercodesaul.util;

/**
 * Clase que almacena las constantes utilizadas para la practica
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Constantes {

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

  /**
   * Metodo para repetir una cadena un cierto numero de veces
   *
   * @param c Cadena a repetir
   * @param n Numero de veces
   * @return
   */
  public static int random(int startInclusive, int endExclusive) {
    return (int) (Math.random() * endExclusive + startInclusive);
  }
}
