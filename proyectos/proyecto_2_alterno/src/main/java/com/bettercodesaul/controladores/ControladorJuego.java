package com.bettercodesaul.controladores;

// import static com.bettercodesaul.repositorio.RepositorioEnemigos.*;
import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.repositorio.RepositorioEnemigos;
import com.bettercodesaul.vistas.*;
import java.util.Iterator;
import java.util.Scanner;

public class ControladorJuego {
  private RepositorioEnemigos repo = RepositorioEnemigos.getInstance();
  private Scanner scanner = new Scanner(System.in);
  private Nave aliado;

  private VistaTurnoAliado vistaTurnoAliado;
  private VistaTurnoEnemigo vistaTurnoEnemigo;

  public ControladorJuego(Nave aliado) {
    this.aliado = aliado;
    vistaTurnoAliado = VistaTurnoAliado.getInstance();
    vistaTurnoEnemigo = VistaTurnoEnemigo.getInstance();
  }

  public void jugar() {
    Iterator<Nave> ite = repo.getEnemigos();
    while (ite.hasNext()) {
      Nave enemy = ite.next();
      warning(property("messages.enemigo.nuevo") + "\n" + enemy.toString());
      boolean vivo = enfrentamiento(aliado, enemy);
      if (!vivo) {
        error(property("messages.game.over"));
        System.exit(0);
      }
    }
    success(property("messages.game.win"));
  }

  public boolean enfrentamiento(Nave aliado, Nave enemigo) {
    do {
      jugarTurno(aliado, enemigo);

      if (aliado.getVida() <= 0) {
        return false;

      } else if (enemigo.getVida() <= 0) {
        System.out.println("El enemigo perdio");
        return true;
      }
    } while (enemigo.getVida() > 0);

    return true;
  }

  public void jugarTurno(Nave aliado, Nave enemigo) {
    int varAli = random(1, aliado.getVelocidad() + 1);
    int varEnem = random(1, enemigo.getVelocidad() + 1);

    if (varAli > varEnem) {
      vistaTurnoAliado.showMenu();
      turnoAliado(aliado, enemigo);
    } else {
      vistaTurnoEnemigo.showMessageTurno();
      turnoEnemigo(enemigo, aliado);
    }
  }

  public void turnoAliado(Nave aliado, Nave enemigo) {
    vistaTurnoAliado.showMenu();
    int resp = 0;

    do {
      try {
        resp = scanner.nextInt();
        switch (resp) {
          case 1:
            vistaTurnoAliado.atacar();
            aliado.atacar(enemigo);
            break;
          case 2:
            vistaTurnoAliado.defender();
            aliado.defender();
            break;
          case 3:
            vistaTurnoAliado.activarPowerUp();
            aliado.powerUp();
            break;
          default:
            throw new Exception();
        }

        vistaTurnoAliado.showMenu();
      } catch (Exception e) {
        error(property("messages.error.invalid.option"));
        scanner = new Scanner(System.in);
        resp = 0;
      }
    } while (resp == 0);
  }

  public void turnoEnemigo(Nave enemigo, Nave aliado) {
    int p = random(1, 4);

    switch (p) {
      case 1:
        vistaTurnoEnemigo.atacar();
        enemigo.atacar(aliado);
        break;
      case 2:
        vistaTurnoEnemigo.defender();
        enemigo.defender();
        break;
      case 3:
        vistaTurnoEnemigo.activarPowerUp();
        enemigo.powerUp();
        break;
    }

    success(property("menu.acciones.aliado"));
  }
}
