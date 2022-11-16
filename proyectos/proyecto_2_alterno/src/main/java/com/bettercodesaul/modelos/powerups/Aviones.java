package com.bettercodesaul.modelos.powerups;

import com.bettercodesaul.interfaces.PowerUp;
import com.bettercodesaul.modelos.barcos.Nave;

public class Aviones implements PowerUp {

  public Aviones() {}

  public String nombre() {
    return "Aviones";
  }

  public String descripcion() {
    return "Un conjunto de aviones de combate te apoyan en la batalla, aumentando tu danio un 30%";
  }

  public void comportamientoAtaque(Nave barco) {
    int aumento = barco.getAtaque() + (int) Math.round(barco.getAtaque() * 0.3);
    barco.setAtaque(aumento);
  }

  public void comportamientoDefensa(Nave barco) {}
}
