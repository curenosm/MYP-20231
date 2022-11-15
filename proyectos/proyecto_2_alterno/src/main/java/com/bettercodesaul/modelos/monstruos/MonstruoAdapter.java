package com.bettercodesaul.modelos.monstruos;

import com.bettercodesaul.modelos.barcos.Nave;
import java.util.Random;

public class MonstruoAdapter extends Nave {

  private MonstruoMarino monstruo;

  public MonstruoAdapter(MonstruoMarino Monstruo) {
    this.tipo = monstruo.getNombre();
    this.ataque = monstruo.getAtaque();
    this.vida = monstruo.getVitalidad();
    this.blindaje = monstruo.getResistencia();
  }

  @Override
  public int getAgilidad() {
    return 0;
  }

  @Override
  public boolean getDefendiendo() {
    return false;
  }

  @Override
  public int getVelocidad() {
    return 5;
  }

  @Override
  public boolean esquivar() {
    return false;
  }

  @Override
  public void atacar(Nave enemigo) {
    enemigo.setVida(enemigo.getVida() - this.ataque);
  }

  @Override
  public void defender() {
    this.defendiendo = false;
  }

  @Override
  public Object generarNave() throws CloneNotSupportedException {

    try {
      Nave copia = (Nave) this.clone();
      Random r = new Random();
      copia.setAtaque(100 + r.nextInt(4000));
      copia.setBlindaje(100 + r.nextInt(1200));
      copia.setVelocidad(1 + r.nextInt(2));
      copia.setVida(1000 + r.nextInt(3000));
      return copia;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public void powerUp() {
    this.vida += 1000;
    this.ataque += 500;
    this.blindaje += 200;
  }
}
