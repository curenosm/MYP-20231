package com.bettercodesaul.vistas;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

/**
 * Clase que representa la vista del juego durante la ejecucion
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class VistaMenu {

  private static volatile VistaMenu uniqueInstance;

  /** Constructor privado para usar Singleton */
  private VistaMenu() {}

  /**
   * Metodo que devuelve una instancia de la clase tras realizar un par de verificaciones
   *
   * @return VistaTurnoAliado
   */
  public static VistaMenu getInstance() {
    if (uniqueInstance == null) {
      synchronized (VistaMenu.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new VistaMenu();
        }
      }
    }

    return uniqueInstance;
  }

  /**
   * Mensaje de generacion de documento
   */
  public void generado() {
    warning(property("messages.doc.generado"));
  }

  /**
   * Imprime el mensaje de bienvenida
   */
  public void saludo() {
    success(property("saludo"));
  }

  /**
   * Imprime el menu pricipal
   */
  public void menu() {
    success(property("menu"));
  }

  /**
   * Imprime el mensaje de salida
   */
  public void salir() {
    success(property("salir"));
  }

  /**
   * Mensaje en caso de opcion incorrecta
   */
  public void opcionInvalida() {
    error(property("messages.error.invalid.option"));
  }
}
