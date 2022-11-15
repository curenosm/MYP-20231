package com.bettercodesaul.modelos.powerUps;

import com.bettercodesaul.interfaces.PowerUp;
import com.bettercodesaul.modelos.barcos.Nave;

public class Reforzar implements PowerUp {

  public Reforzar() {}

  public String descripcion() {
    return "Refuerzas tu barco con una aleacion de Adamantium, aumentando tu blindaje un 70%";
  }

  public void comportamientoAtaque(Nave barco) {}

  public void comportamientoDefensa(Nave barco) {
    int aumento = barco.getBlindaje() + (int) Math.round(barco.getBlindaje() * 0.7);
    barco.setBlindaje(aumento);
  }
}
