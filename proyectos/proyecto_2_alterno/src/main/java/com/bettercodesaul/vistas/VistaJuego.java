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

  /** Imprime la vista asociada a la aparicion de un nuevo enemigo */
  public void nuevoEnemigo(Nave enemy) {
    warning(property("messages.enemigo.nuevo") + "\n" + enemy.toString());
  }

  /** Imprime el mensaje en caso de haber perdido el juego */
  public void gameOver() {
    error(property("messages.game.over"));
  }

  /** Imprime el mensaje en caso de haber ganado el juego */
  public void gameWin() {
    success(property("messages.game.win"));
  }

  /** Imprime un mensaje en caso de que el contrincante actual pierda */
  public void enemigoPerdio() {
    success(property("messages.perdio.enemigo"));
  }

  /** Imprime un mensaje de error en caso de seleccionar una opcion incorrecta */
  public void opcionInvalida() {
    error(property("messages.error.invalid.option"));
  }

  /**
   * Imprime un mensaje asociado a la accion de un barco
   *
   * @param s accion rtelacada por el barco
   */
  public void accionBarco(String s) {
    bold(s);
  }
}
