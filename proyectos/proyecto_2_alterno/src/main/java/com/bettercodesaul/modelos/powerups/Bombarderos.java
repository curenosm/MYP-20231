package com.bettercodesaul.modelos.powerups;

import com.bettercodesaul.modelos.barcos.Nave;

public class Bombarderos implements PowerUp {

  public Bombarderos() {}

  public String nombre() {
    return "Bombarderos";
  }

  public String descripcion() {
    return "Un conjunto de aviones de bombarderos, aumentando tu danio un 60%";
  }

  public void comportamientoAtaque(Nave barco) {
    int aumento = barco.getAtaque() + (int) Math.round(barco.getAtaque() * 0.6);
    barco.setAtaque(aumento);
  }

  public void comportamientoDefensa(Nave barco) {}
}
