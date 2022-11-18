package com.bettercodesaul.modelos;

/**
 * Modelo que representa un componente de la nave
 * 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
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
    return "Id: "
        + this.id
        + "\n"
        + "Nombre: "
        + this.nombre
        + "\n"
        + "Ataque: "
        + this.ataque
        + "\n"
        + "Blindaje: "
        + this.blindaje
        + "\n"
        + "Agilidad: "
        + this.agilidad
        + "\n"
        + "Velocidad: "
        + this.velocidad
        + "\n"
        + "\n";
  }
}
