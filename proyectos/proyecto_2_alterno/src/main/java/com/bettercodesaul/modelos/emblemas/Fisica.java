package com.bettercodesaul.modelos.emblemas;

import com.bettercodesaul.modelos.Componente;

/**
 * Modelo que representa un
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Fisica extends Componente {

  public Fisica() {
    super();
    this.id = 300L;
    this.nombre = "Fisica";
    this.ataque = 320;
    this.blindaje = 350;
    this.agilidad = 0;
    this.velocidad = 2;
  }
}
