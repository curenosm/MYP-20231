package com.bettercodesaul.modelos.blindajes;

import com.bettercodesaul.modelos.Componente;

public class BlindajeMilitar extends Componente {

  public BlindajeMilitar() {
    super();
    this.id = 30L;
    this.nombre = "Blindaje Militar";
    this.ataque = 0;
    this.blindaje = 450;
    this.agilidad = 1;
    this.velocidad = 0;
  }
}
