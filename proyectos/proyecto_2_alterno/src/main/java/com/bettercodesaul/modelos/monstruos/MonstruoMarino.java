package com.bettercodesaul.modelos.monstruos;

public class MonstruoMarino {

  private String nombre;
  private int ataque;
  private int vitalidad;
  private int resistencia;

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
