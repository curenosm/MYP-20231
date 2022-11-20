package com.bettercodesaul.modelos.monstruos;

import static com.bettercodesaul.util.Constantes.*;

import com.bettercodesaul.modelos.barcos.Nave;
import java.util.Random;

/**
 * Clase Adaptadora de un monstruo para que se comporte como una Nave
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class MonstruoAdapter extends Nave {

  /**
   * Constructor con parametros de la clase
   *
   * @param monstruo Instancia de la clase MonstruoMarino
   */
  public MonstruoAdapter(MonstruoMarino monstruo) {
    this.tipo = monstruo.getNombre();
    this.ataque = monstruo.getAtaque();
    this.vida = monstruo.getVitalidad();
    this.blindaje = monstruo.getResistencia();
    this.agilidad = 0;
  }

  @Override
  public boolean esquivar() {
    return false;
  }

  @Override
  public boolean getDefendiendo() {
    return false;
  }

  /**
   * Metodo para atacar
   *
   * @param Nave enemigo a atacar
   */
  @Override
  public String atacar(Nave enemigo) {
    enemigo.setVida(enemigo.getVida() - this.ataque);
    return property("messages.ataque.acertado")
        + "\n"
        + property("messages.ataque.danio")
        + this.ataque
        + "\n"
        + property("messages.objetivo.vida")
        + enemigo.getVida();
  }

  @Override
  public void defender() {
    this.defendiendo = false;
  }

  /**
   * Metodo encargado de generar naves usando el patron prototype
   *
   * @return Object nave construida
   * @throws CloneNotSupportedException
   */
  @Override
  public Object generarNave() throws CloneNotSupportedException {

    try {
      Nave copia = (Nave) this.clone();
      Random r = new Random();
      copia.setAtaque(random(1000, 2501));
      copia.setBlindaje(random(200, 601));
      copia.setVelocidad(random(1, 4));
      copia.setVida(random(1000, 3001));
      return copia;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public String powerUp() {
    this.vida += 1000;
    this.ataque += 500;
    this.blindaje += 200;
    return property("messages.powerup.monstruo");
  }
}
