package com.bettercodesaul.interfaces;

public interface Powerup {

  public String descripcion();
  
  public void comportamientoAtaque(Nave barco);

  public void comportamientoDefensa(Nave barco);
}
