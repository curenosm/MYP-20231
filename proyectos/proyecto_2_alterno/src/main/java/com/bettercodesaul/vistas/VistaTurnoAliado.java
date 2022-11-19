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

  /**
   * Metodo que meustra el menu de acciones del jugador en la partida
   */
  public void showMenu() {
    success(property("menu.acciones.aliado"));
  }

  /**
   * Mensaje del turno del jugador
   */
  public void showMessageTurno() {
    success(property("messages.turno.aliado"));
  }

  /**
   * Mensaje de activacion de poder especial
   */
  public void activarPowerUp() {
    success(property("messages.powerup.aliado"));
  }

  /**
   * Mensaje a imprimir al momento de defenderse
   */
  public void defender() {
    success(property("messages.defensa.aliado"));
  }

  /**
   * Mensaje a imprimir mientras se ataca
   */
  public void atacar() {
    success(property("messages.ataque.aliado"));
  }
}
