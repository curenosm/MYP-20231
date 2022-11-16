package com.bettercodesaul.modelos.barcos;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.powerups.*;
import java.util.List;

public class PortaAviones extends Nave {

  public PortaAviones(Componente arma, Componente coraza, Componente emblema) {

    super(arma, coraza, emblema);
    this.tipo = "Porta Aviones";
    this.ataque = 700 + arma.getAtaque() + emblema.getAtaque();
    this.blindaje = 200 + coraza.getBlindaje() + emblema.getBlindaje();
    this.vida = 5000;
    this.agilidad = 1 + arma.getAgilidad() + coraza.getAgilidad() + emblema.getAgilidad();
    this.velocidad = 3 + arma.getVelocidad() + coraza.getVelocidad() + emblema.getVelocidad();
    this.poderes = List.of(new Radar(), new Aviones(), new Bombarderos(), new Cazas());
  }
}
