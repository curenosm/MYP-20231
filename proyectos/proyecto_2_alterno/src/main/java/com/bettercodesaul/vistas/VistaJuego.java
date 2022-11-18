package com.bettercodesaul.vistas;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

import com.bettercodesaul.modelos.barcos.Nave;

/**
 * Clase que representa la vista del juego durante la ejecucion
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class VistaJuego {

  private static volatile VistaJuego uniqueInstance;

  /** Constructor privado para usar Singleton */
  private VistaJuego() {}

  /**
   * Metodo que devuelve una instancia de la clase tras realizar un par de verificaciones
   *
   * @return VistaTurnoAliado
   */
  public static VistaJuego getInstance() {
    if (uniqueInstance == null) {
      synchronized (VistaJuego.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new VistaJuego();
        }
      }
    }

    return uniqueInstance;
  }

  public void nuevoEnemigo(Nave enemy) {
    warning(property("messages.enemigo.nuevo") + "\n" + enemy.toString());
  }

  public void gameOver() {
    error(property("messages.game.over"));
  }

  public void gameWin() {
    success(property("messages.game.win"));
  }

  public void enemigoPerdio() {
    success(property("messages.perdio.enemigo"));
  }

  public void opcionInvalida() {
    error(property("messages.error.invalid.option"));
  }

  public void accionBarco(String s) {
    bold(s);
  }
}
