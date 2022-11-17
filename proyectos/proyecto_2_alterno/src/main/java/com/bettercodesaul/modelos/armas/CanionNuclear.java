package com.bettercodesaul.modelos.armas;

import com.bettercodesaul.modelos.Componente;

public class CanionNuclear extends Componente {

  public CanionNuclear() {
    super();
    this.id = 2L;
    this.nombre = "Canion Nuclear";
    this.ataque = 800;
    this.blindaje = 0;
    this.agilidad = 0;
    this.velocidad = -3;
  }
}
