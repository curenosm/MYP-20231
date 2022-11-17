package com.bettercodesaul.modelos.armas;

import com.bettercodesaul.modelos.Componente;

public class CanionDoble extends Componente {

  public CanionDoble() {
    super();
    this.id = 1L;
    this.nombre = "Canion Doble";
    this.ataque = 300;
    this.blindaje = 0;
    this.agilidad = 0;
    this.velocidad = -1;
  }
}
