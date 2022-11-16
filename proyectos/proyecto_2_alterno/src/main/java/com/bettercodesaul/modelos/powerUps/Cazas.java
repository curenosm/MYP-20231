package com.bettercodesaul.modelos.powerUps;

import com.bettercodesaul.interfaces.PowerUp;
import com.bettercodesaul.modelos.barcos.Nave;

public class Cazas implements PowerUp {

  public Cazas() {}

  public String nombre() {
    return "Cazas";
  }

  public String descripcion() {
    return "Un conjunto de cazas militares, aumentando tu danio al doble";
  }

  public void comportamientoAtaque(Nave barco) {
    int aumento = barco.getAtaque() * 2;
    barco.setAtaque(aumento);
  }

  public void comportamientoDefensa(Nave barco) {}
}
