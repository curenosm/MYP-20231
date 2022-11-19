package com.bettercodesaul.modelos.armas;

import com.bettercodesaul.modelos.Componente;

/**
 * Modelo que representa un canion simple
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
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
