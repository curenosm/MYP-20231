package com.bettercodesaul.vistas;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

/**
 * Clase que representa la vista del juego mientras es turno del aliado
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class VistaTurnoAliado {

  private static volatile VistaTurnoAliado uniqueInstance;

  /** Constructor privado para usar Singleton */
  private VistaTurnoAliado() {}

  /**
   * Metodo que devuelve una instancia de la clase tras realizar un par de verificaciones
   *
   * @return VistaTurnoAliado
   */
  public static VistaTurnoAliado getInstance() {
    if (uniqueInstance == null) {
      synchronized (VistaTurnoAliado.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new VistaTurnoAliado();
        }
      }
    }

    return uniqueInstance;
  }

  public void showMenu() {
    success(property("messages.turno.aliado"));
  }

  public void showMessageTurno() {
    success(property("messages.turno.aliado"));
  }

  public void activarPowerUp() {
    success(property("messages.powerup.aliado"));
  }

  public void defender() {
    success(property("messages.defensa.aliado"));
  }

  public void atacar() {
    success(property("messages.ataque.aliado"));
  }
}
