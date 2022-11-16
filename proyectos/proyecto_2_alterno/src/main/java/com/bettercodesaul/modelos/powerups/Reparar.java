package com.bettercodesaul.modelos.powerups;

import com.bettercodesaul.interfaces.PowerUp;
import com.bettercodesaul.modelos.barcos.Nave;

public class Reparar implements PowerUp {

  public Reparar() {}

  public String nombre() {
    return "Reparar";
  }

  public String descripcion() {
    return "Cedes por un momento para reparar danios, aumentando tu vida en 1000 puntos";
  }

  public void comportamientoAtaque(Nave barco) {}

  public void comportamientoDefensa(Nave barco) {
    int aumento = barco.getVida() + 1000;
    barco.setBlindaje(aumento);
  }
}
