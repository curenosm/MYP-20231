package com.bettercodesaul.modelos.powerups;

import com.bettercodesaul.modelos.barcos.Nave;

public interface PowerUp {

  public String nombre();

  public String descripcion();

  public void comportamientoAtaque(Nave barco);

  public void comportamientoDefensa(Nave barco);
}