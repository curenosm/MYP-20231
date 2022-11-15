package com.bettercodesaul.modelos.monstruos;

import com.bettercodesaul.modelos.barcos.Nave;

public class MonstruoAdapter extends Nave{

   private MonstruoMarino monstruo;
   

  public MonstruoAdapter(MonstruoMarino Monstruo) {
    this.tipo=monstruo.getNombre();
    this.ataque=monstruo.getAtaque();
    this.vida=monstruo.getVitalidad();
    this.blindaje=monstruo.getResistencia();
  }



public List<PowerUp> getPoderes(){
    return this.poderes;
}

@Override
public int getAgilidad() {
  return 0;
}

@Override
public boolean getDefendiendo() {
  return false;
}

@Override
public int getVelocidad() {
  return 5;
}

@Override
public boolean esquivar() {
    return false;
}

@Override
public void atacar(Nave enemigo) {
      enemigo.setVida(enemigo.getVida() - this.ataque);  
}

@Override
public void defender() {
  this.defendiendo = false;
}
}

