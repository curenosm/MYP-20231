package com.bettercodesaul.modelos.blindajes;

import com.bettercodesaul.modelos.Componente;

/**
 * Modelo que representa un blindaje acorazado
 * 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class BlindajeAcorazado extends Componente {

  public BlindajeAcorazado() {
    super();
    this.id = 10L;
    this.nombre = "Blindaje Acorazado";
    this.ataque = 0;
    this.blindaje = 900;
    this.agilidad = -1;
    this.velocidad = -1;
  }
}
