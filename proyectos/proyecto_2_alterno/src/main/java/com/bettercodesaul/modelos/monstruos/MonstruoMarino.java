package com.bettercodesaul.modelos.monstruos;

/**
 * Modelo que representa un monstruo marino
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class MonstruoMarino {

  private String nombre;
  private int ataque;
  private int vitalidad;
  private int resistencia;

  /**
   * COnstructor con parametros de la clase
   * @param nombre Nombre del monstruo
   * @param ataque Capacidad de ataque
   * @param vitalidad Vida del monstruo
   * @param resistencia Blindaje que recubre al monstruo
   */
  public MonstruoMarino(String nombre, int ataque, int vitalidad, int resistencia) {
    this.nombre = nombre;
    this.ataque = ataque;
    this.vitalidad = vitalidad;
    this.resistencia = resistencia;
  }

  public int getAtaque() {
    return this.ataque;
  }

  public int getVitalidad() {
    return this.vitalidad;
  }

  public int getResistencia() {
    return this.resistencia;
  }

  public String getNombre() {
    return this.nombre;
  }
}
