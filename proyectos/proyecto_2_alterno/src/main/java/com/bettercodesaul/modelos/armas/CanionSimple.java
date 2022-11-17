package com.bettercodesaul.modelos.armas;

import com.bettercodesaul.modelos.Componente;

public class CanionSimple extends Componente {

  public CanionSimple() {
    super();
    this.id = 3L;
    this.nombre = "Canion Simple";
    this.ataque = 100;
    this.blindaje = 0;
    this.agilidad = 0;
    this.velocidad = 0;
  }
}
