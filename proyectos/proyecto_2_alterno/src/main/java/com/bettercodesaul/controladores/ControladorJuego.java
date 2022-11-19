package com.bettercodesaul.controladores;

// import static com.bettercodesaul.repositorio.RepositorioEnemigos.*;
import static com.bettercodesaul.util.Constantes.*;

import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.repositorio.RepositorioEnemigos;
import com.bettercodesaul.vistas.*;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Controlador para armar las naves
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class ControladorJuego {
  private RepositorioEnemigos repo = RepositorioEnemigos.getInstance();
  private Scanner scanner = new Scanner(System.in);
  private Nave aliado;

  private VistaTurnoAliado vistaTurnoAliado;
  private VistaTurnoEnemigo vistaTurnoEnemigo;
  private VistaJuego vistaJuego;

  public ControladorJuego(Nave aliado) {
    this.aliado = aliado;
    vistaTurnoAliado = VistaTurnoAliado.getInstance();
    vistaTurnoEnemigo = VistaTurnoEnemigo.getInstance();
    vistaJuego = VistaJuego.getInstance();
  }

  /** Metodo para iniciar el juego */
  public void jugar() {
    Iterator<Nave> ite = repo.getEnemigos();
    while (ite.hasNext()) {
      Nave enemy = ite.next();
      vistaJuego.nuevoEnemigo(enemy);
      boolean vivo = enfrentamiento(aliado, enemy);
      if (!vivo) {
        vistaJuego.gameOver();

        System.exit(0);
      }
    }
    vistaJuego.gameWin();
    System.exit(0);
  }

  /**
   * Metodo para ejecutar el enfrentamiento de dos naves
   *
   * @param aliado Nuestra nave
   * @param enemigo Nave enemiga
   * @return true en caso de que ganemos el combate
   */
  public boolean enfrentamiento(Nave aliado, Nave enemigo) {
    do {
      jugarTurno(aliado, enemigo);

      if (aliado.getVida() <= 0) {
        return false;

      } else if (enemigo.getVida() <= 0) {
        vistaJuego.enemigoPerdio();
        return true;
      }
    } while (enemigo.getVida() > 0);

    return true;
  }

  /**
   * Metodo para decidir el turno del jugador
   *
   * @param aliado Nuestra nave
   * @param enemigo Nave enemiga
   */
  public void jugarTurno(Nave aliado, Nave enemigo) {
    int varAli = random(1, aliado.getVelocidad() + 1);
    int varEnem = random(1, enemigo.getVelocidad() + 1);

    if (varAli > varEnem) {

      turnoAliado(aliado, enemigo);
    } else {
      vistaTurnoEnemigo.showMessageTurno();
      turnoEnemigo(enemigo, aliado);
    }
  }

  /**
   * Metodo encargado de manejar las acciones en nuestro turno
   *
   * @param aliado
   * @param enemigo
   */
  public void turnoAliado(Nave aliado, Nave enemigo) {
    vistaTurnoAliado.showMenu();
    int resp = 0;

    do {
      try {
        resp = scanner.nextInt();
        switch (resp) {
          case 1:
            vistaTurnoAliado.atacar();
            vistaJuego.accionBarco(aliado.atacar(enemigo));
            break;
          case 2:
            vistaTurnoAliado.defender();
            aliado.defender();
            break;
          case 3:
            vistaTurnoAliado.activarPowerUp();
            vistaJuego.accionBarco(aliado.powerUp());
            break;
          default:
            throw new Exception();
        }

      } catch (Exception e) {
        vistaJuego.opcionInvalida();
        scanner = new Scanner(System.in);
        resp = 0;
      }
    } while (resp == 0);
  }

  /**
   * Metodo encargado de simular el comportamiento del enemigo durante el juego
   *
   * @param enemigo
   * @param aliado
   */
  public void turnoEnemigo(Nave enemigo, Nave aliado) {
    int p = random(1, 4);

    switch (p) {
      case 1:
        vistaTurnoEnemigo.atacar();
        vistaJuego.accionBarco(enemigo.atacar(aliado));
        break;
      case 2:
        vistaTurnoEnemigo.defender();
        enemigo.defender();
        break;
      case 3:
        vistaTurnoEnemigo.activarPowerUp();
        vistaJuego.accionBarco(enemigo.powerUp());
        break;
    }
  }
}
