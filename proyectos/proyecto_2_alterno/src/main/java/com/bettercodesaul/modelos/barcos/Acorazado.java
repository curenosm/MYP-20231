package com.bettercodesaul.modelos.barcos;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.powerUps.*;
import java.util.List;

public class Acorazado extends Nave {

  public Acorazado(Componente arma, Componente coraza, Componente emblema) {

    super(arma, coraza, emblema);
    this.tipo = "Acorazado";
    this.ataque = 500 + arma.getAtaque() + emblema.getAtaque();
    this.blindaje = 400 + coraza.getBlindaje() + emblema.getBlindaje();
    this.vida = 4000;
    this.agilidad = arma.getAgilidad() + coraza.getAgilidad() + emblema.getAgilidad();
    this.velocidad = 4 + arma.getVelocidad() + coraza.getVelocidad() + emblema.getVelocidad();
    this.poderes = List.of(new Radar(), new Reparar(), new Blindar(), new Reforzar());
  }
}
