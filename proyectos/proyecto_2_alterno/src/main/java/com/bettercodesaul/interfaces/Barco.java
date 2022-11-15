package com.bettercodesaul.interfaces;

import com.bettercodesaul.modelos.barcos.Nave;

public interface Barco {

  public void atacar(Nave barco);

  public void defender();

  public Object generarNave() throws CloneNotSupportedException;
}
