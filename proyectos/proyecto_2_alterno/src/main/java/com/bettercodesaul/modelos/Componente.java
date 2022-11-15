package com.bettercodesaul.modelos;

public class Componente implements Cloneable {
  protected String nombre;
  protected int ataque;
  protected int blindaje;
  protected int agilidad;
  protected int velocidad;

  public String getNombre() {
    return this.nombre;
  }

  public int getAtaque() {
    return this.ataque;
  }

  public int getBlindaje() {
    return this.blindaje;
  }

  public int getAgilidad() {
    return this.agilidad;
  }

  public int getVelocidad() {
    return this.velocidad;
  }

  public Object clonar() throws CloneNotSupportedException {
    try {

      return (Componente) this.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }
}
