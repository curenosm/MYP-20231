package com.bettercodesaul.modelos.powerups;

import com.bettercodesaul.modelos.barcos.Nave;

public class Radar implements PowerUp {

  public Radar() {}

  public String nombre() {
    return "Radar";
  }

  public String descripcion() {
    return "Utilizas un radar para detectar a tus enemigos y su ataques, aumentas en 3 tu agilidad";
  }

  public void comportamientoAtaque(Nave barco) {}

  public void comportamientoDefensa(Nave barco) {

    barco.setAgilidad(barco.getAgilidad() + 3);
  }
}
