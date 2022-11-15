package com.bettercodesaul.modelos.powerUps;

import com.bettercodesaul.interfaces.PowerUp;
import com.bettercodesaul.modelos.barcos.Nave;

public class Sumergir implements PowerUp {

  public Sumergir() {}

  public String descripcion() {
    return "Sumerges tu barco para evitar danios, duplicando tu agilidad, pero reduciendo tu velocidad en 1";
  }

  public void comportamientoAtaque(Nave barco) {}

  public void comportamientoDefensa(Nave barco) {
    barco.setVelocidad(barco.getVelocidad() - 2);
    barco.setAgilidad(barco.getAgilidad() * 2);
  }
}
