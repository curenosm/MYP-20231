package com.bettercodesaul.modelos.blindajes;

import com.bettercodesaul.modelos.Componente;

public class BlindajeAcorazado extends Componente {

  public BlindajeAcorazado() {
    this.id = 010L;
    this.nombre = "Blindaje Acorazado";
    this.ataque = 0;
    this.blindaje = 900;
    this.agilidad = -1;
    this.velocidad = -1;
  }
}
