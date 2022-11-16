package com.bettercodesaul.modelos;

public class Componente implements Cloneable {

  protected Long id = 000L;
  protected String nombre = "";
  protected int ataque = 0;
  protected int blindaje = 0;
  protected int agilidad = 0;
  protected int velocidad = 0;

  public Componente() {}

  public Long getId() {
    return this.id;
  }

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

  public String toString() {
    return "Nombre: "
        + this.nombre
        + "Ataque: "
        + this.ataque
        + "Blindaje: "
        + this.blindaje
        + "Agilidad: "
        + this.agilidad
        + "Velocidad: "
        + this.velocidad;
  }
}
