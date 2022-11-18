package com.bettercodesaul.modelos.barcos;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.powerups.*;
import java.util.List;

/**
 * Nave del tipo submarino
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Submarino extends Nave {

  public Submarino(Componente arma, Componente coraza, Componente emblema) {

    super(arma, coraza, emblema);
    this.tipo = "Submarino";
    this.ataque = 1400 + arma.getAtaque() + emblema.getAtaque();
    this.blindaje = 100 + coraza.getBlindaje() + emblema.getBlindaje();
    this.vida = 2200;
    this.agilidad = 4 + arma.getAgilidad() + coraza.getAgilidad() + emblema.getAgilidad();
    this.velocidad = 6 + arma.getVelocidad() + coraza.getVelocidad() + emblema.getVelocidad();
    this.poderes = List.of(new Radar(), new Propulsar(), new Sumergir(), new Reparar());
  }
}
