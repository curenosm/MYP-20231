package com.bettercodesaul.modelos.powerUps;

import com.bettercodesaul.interfaces.PowerUp;
import com.bettercodesaul.modelos.barcos.Nave;

public class Blindar implements PowerUp {

  public Blindar() {}

  public String descripcion() {
    return "Blindas tu barco con una aleacion de Vibranium, aumentando tu blindaje un 40%";
  }

  public void comportamientoAtaque(Nave barco) {}

  public void comportamientoDefensa(Nave barco) {
    int aumento = barco.getBlindaje() + (int) Math.round(barco.getBlindaje() * 0.4);
    barco.setBlindaje(aumento);
  }
}
