package com.bettercodesaul.modelos.emblemas;

import com.bettercodesaul.modelos.Componente;

/**
 * Modelo que representa un emblema de la carrera de CC
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class CC extends Componente {

  public CC() {
    super();
    this.id = 200L;
    this.nombre = "CC";
    this.ataque = 600;
    this.blindaje = 0;
    this.agilidad = 2;
    this.velocidad = 0;
  }
}
