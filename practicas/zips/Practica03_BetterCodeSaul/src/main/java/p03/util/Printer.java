package main.java.p03.util;

import static com.diogonunes.jcolor.Attribute.*;

import com.diogonunes.jcolor.*;

/**
 * Clase cuya funcion es imprimir en pantalla mensajes con cierto formato deseado
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class Printer {

  private static AnsiFormat error = new AnsiFormat(BOLD(), RED_TEXT());
  private static AnsiFormat warning = new AnsiFormat(BOLD(), YELLOW_TEXT());
  private static AnsiFormat success = new AnsiFormat(BOLD(), GREEN_TEXT());
  private static AnsiFormat version = new AnsiFormat(BRIGHT_BLUE_TEXT());
  private static AnsiFormat bold = new AnsiFormat(BOLD(), BLUE_TEXT());

  /**
   * Metodo que imprime en una nueva linea el mensaje deseado
   *
   * @param s String con el mensaje deseado
   */
  public static void println(String s) {
    System.out.println(s);
  }

  /**
   * Metodo para imprimir en la misma linea el mensaje deseado
   *
   * @param s String con el mensaje deseado
   */
  public static void print(String s) {
    System.out.print(s);
  }

  /** Metodo para imprimir la informacion de la practica */
  public static void printProjectInformation() {
    version(
        "Project: Practica 2 (Template, State, Iterator)\n"
            + "Version: 1.0.0\n"
            + "Authors: BETTER CODE SAUL");
  }

  /**
   * Metodo para imprimir en pantalla una nueva linea el mensaje deseado con un cierto color
   *
   * @param s String con el mensaje deseado
   * @param style Instancia AnsiFormat con el formato deseado
   */
  public static void println(String s, AnsiFormat style) {
    println("");
    println(style.format(s));
  }

  /**
   * Metodo para imprimir en una nueva linea un mensaje en color rojo
   *
   * @param s String con el mensaje deseado
   */
  public static void error(String s) {
    println(s, error);
  }

  /**
   * Metodo para imprimir en una nueva linea un mensaje en color amarillo
   *
   * @param s String con el mensaje deseado
   */
  public static void warning(String s) {
    println(s, warning);
  }

  /**
   * Metodo para imprimir en una nueva linea un mensaje en color verde
   *
   * @param s String con el mensaje deseado
   */
  public static void success(String s) {
    println(s, success);
  }

  /**
   * Metodo para imprimir en una nueva linea un mensaje en color azul y negritas
   *
   * @param s String con el mensaje deseado
   */
  public static void bold(String s) {
    println(s, bold);
  }

  /**
   * Metodo para imprimir en una nueva linea un mensaje en color azul claro
   *
   * @param s String con el mensaje deseado
   */
  public static void version(String s) {
    println(s, version);
  }
}
