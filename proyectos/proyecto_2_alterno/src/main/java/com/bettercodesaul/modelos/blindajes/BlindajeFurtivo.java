package com.bettercodesaul.modelos.blindajes;

import com.bettercodesaul.modelos.Componente;

public class BlindajeFurtivo extends Componente {

  public BlindajeFurtivo() {
    super();
    this.id = 20L;
    this.nombre = "Blindaje Furtivo";
    this.ataque = 0;
    this.blindaje = 300;
    this.agilidad = 2;
    this.velocidad = 0;
  }
}
