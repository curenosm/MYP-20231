package com.bettercodesaul.vistas;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

/**
 * Clase que representa la vista del juego mientras es turno del enemigo
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class VistaTurnoEnemigo {

  private static volatile VistaTurnoEnemigo uniqueInstance;

  /** Constructor privado para usar Singleton */
  private VistaTurnoEnemigo() {}

  /**
   * Metodo que devuelve una instancia de la clase tras realizar un par de verificaciones
   *
   * @return VistaTurnoEnemigo
   */
  public static VistaTurnoEnemigo getInstance() {
    if (uniqueInstance == null) {
      synchronized (VistaTurnoEnemigo.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new VistaTurnoEnemigo();
        }
      }
    }

    return uniqueInstance;
  }

  public void showMessageTurno() {
    error(property("messages.turno.enemigo"));
  }

  public void activarPowerUp() {
    error(property("messages.powerup.enemigo"));
  }

  public void defender() {
    error(property("messages.defensa.enemigo"));
  }

  public void atacar() {
    error(property("messages.ataque.enemigo"));
  }
}
