package com.bettercodesaul.interfaces;

import com.bettercodesaul.modelos.barcos.Nave;

public interface PowerUp {

  public String nombre();

  public String descripcion();

  public void comportamientoAtaque(Nave barco);

  public void comportamientoDefensa(Nave barco);
}
