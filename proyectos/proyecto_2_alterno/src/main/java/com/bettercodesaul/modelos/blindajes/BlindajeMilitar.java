package com.bettercodesaul.modelos.blindajes;

import com.bettercodesaul.modelos.Componente;

/**
 * Modelo que representa un blindaje militar
 * 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
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
