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
public class VistaBuilder {

  private static volatile VistaBuilder uniqueInstance;

  /** Constructor privado para usar Singleton */
  private VistaBuilder() {}

  /**
   * Metodo que devuelve una instancia de la clase tras realizar un par de verificaciones
   *
   * @return VistaTurnoAliado
   */
  public static VistaBuilder getInstance() {
    if (uniqueInstance == null) {
      synchronized (VistaBuilder.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new VistaBuilder();
        }
      }
    }

    return uniqueInstance;
  }

  public void menuArmas() {
    info(property("menu.tipo.armas"));
  }

  public void menuBlindajes() {
    info(property("menu.tipo.blindajes"));
  }

  public void menuEmblemas() {
    info(property("menu.tipo.emblemas"));
  }

  public void menuTipo() {
    info(property("menu.tipo.barcos"));
  }

  public void opcionInvalida() {
    error(property("messages.error.invalid.option"));
  }
}
