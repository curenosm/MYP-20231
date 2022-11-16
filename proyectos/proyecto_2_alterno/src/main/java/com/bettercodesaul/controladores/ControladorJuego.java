package com.bettercodesaul.controladores;

// import static com.bettercodesaul.repositorio.RepositorioEnemigos.*;
import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.repositorio.RepositorioEnemigos;
import java.util.Iterator;
import java.util.Scanner;

public class ControladorJuego {
  private RepositorioEnemigos repo = new RepositorioEnemigos();
  private Scanner scanner = new Scanner(System.in);
  private Nave aliado;

  public ControladorJuego(Nave aliado) {
    this.aliado = aliado;
  }

  public void jugar() {
    Iterator<Nave> ite = repo.getEnemigos();
    while (ite.hasNext()) {

      boolean vivo = enfrentamiento(aliado, ite.next());
      if (!vivo) {
        error(property("messages.game.over"));
        System.exit(0);
      }
    }
    success(property("messages.game.win"));
  }

  public boolean enfrentamiento(Nave aliado, Nave enemigo) {
    while (true) {
      jugarTurno(aliado, enemigo);
      if (aliado.getVida() <= 0) {
        return false;
      } else if (enemigo.getVida() <= 0) {
        return true;
      }
    }
  }

  public void jugarTurno(Nave aliado, Nave enemigo) {
    int varAli = random(1, aliado.getVelocidad() + 1);
    int varEnem = random(1, enemigo.getVelocidad() + 1);

    if (varAli > varEnem) {
      turnoAliado(aliado, enemigo);
    } else {
      turnoEnemigo(enemigo, aliado);
    }
  }

  public void turnoAliado(Nave aliado, Nave enemigo) {
    success(property("menu.acciones.aliado"));
    int resp = 0;
    do {
      try {
        resp = scanner.nextInt();
        switch (resp) {
          case 1:
            success(property("messages.ataque.aliado"));
            aliado.atacar(enemigo);
            break;

          case 2:
            success(property("messages.defensa.aliado"));
            aliado.defender();
            break;

          case 3:
            success(property("messages.powerup.aliado"));
            aliado.powerUp();
            break;

          default:
            throw new Exception();
        }

      } catch (Exception e) {
        error(property("messages.error.invalid.option"));
        scanner = new Scanner(System.in);
      }
    } while (true);
  }

  public void turnoEnemigo(Nave enemigo, Nave aliado) {
    int p = random(1, 4);
    switch (p) {
      case 1:
        error(property("messages.ataque.enemigo"));
        enemigo.atacar(aliado);
        break;

      case 2:
        error(property("messages.defensa.enemigo"));
        enemigo.defender();
        break;

      case 3:
        error(property("messages.powerup.enemigo"));
        enemigo.powerUp();
        break;
    }
  }
}
