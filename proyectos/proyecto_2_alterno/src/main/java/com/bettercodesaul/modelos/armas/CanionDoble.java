package com.bettercodesaul.modelos.armas;

import com.bettercodesaul.modelos.Componente;

/**
 * Modelo que representa un canion doble
 * 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class CanionDoble extends Componente {

  public CanionDoble() {
    super();
    this.id = 1L;
    this.nombre = "Canion Doble";
    this.ataque = 300;
    this.blindaje = 0;
    this.agilidad = 0;
    this.velocidad = -1;
  }
}
