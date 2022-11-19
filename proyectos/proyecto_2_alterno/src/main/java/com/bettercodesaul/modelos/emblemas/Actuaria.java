package com.bettercodesaul.modelos.emblemas;

import com.bettercodesaul.modelos.Componente;

/**
 * Modelo que representa un emblema de la carrera de Actuaria
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Actuaria extends Componente {

  public Actuaria() {
    super();
    this.id = 100L;
    this.nombre = "Actuaria";
    this.ataque = 200;
    this.blindaje = 100;
    this.agilidad = 0;
    this.velocidad = 0;
  }
}
