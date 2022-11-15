package com.bettercodesaul.modelos.barcos;

import com.bettercodesaul.interfaces.Barco;
import com.bettercodesaul.interfaces.PowerUp;
import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.powerUps.*;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Nave implements Barco, Cloneable {

  protected String tipo = "";
  protected boolean defendiendo = false;
  protected int ataque = 0;
  protected int vida = 0;
  protected int blindaje = 0;
  protected int agilidad = 0;
  protected int velocidad = 0;
  protected Componente arma;
  protected Componente coraza;
  protected Componente emblema;
  protected List<PowerUp> poderes;

  public Nave() {}

  public Nave(Componente arma, Componente coraza, Componente emblema) {
    this.arma = arma;
    this.coraza = coraza;
    this.emblema = emblema;
  }

  public List<PowerUp> getPoderes() {
    return this.poderes;
  }

  public String getTipo() {
    return this.tipo;
  }

  public int getAgilidad() {
    return this.agilidad;
  }

  public boolean getDefendiendo() {
    return this.defendiendo;
  }

  public int getAtaque() {
    return this.ataque;
  }

  public int getBlindaje() {
    return this.blindaje;
  }

  public int getVelocidad() {
    return this.velocidad;
  }

  public int getVida() {
    return this.vida;
  }

  public void setAgilidad(int agilidad) {
    this.agilidad = agilidad;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }

  public void setAtaque(int ataque) {
    this.ataque = ataque;
  }

  public void setBlindaje(int blindaje) {
    this.blindaje = blindaje;
  }

  public void setDefendiendo(boolean defendiendo) {
    this.defendiendo = defendiendo;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public void setArma(Componente arma) {
    this.arma = arma;
  }

  public void setEmblema(Componente emblema) {
    this.emblema = emblema;
  }

  public void setCoraza(Componente coraza) {
    this.coraza = coraza;
  }

  public boolean esquivar() {
    Random r = new Random();
    int valorDado = r.nextInt(10) + 1;
    if (this.agilidad >= valorDado) {
      return true;
    } else {
      return false;
    }
  }

  public void atacar(Nave enemigo) {
    if (!enemigo.esquivar()) {
      if (enemigo.getDefendiendo()) {
        int danio = this.ataque - enemigo.getBlindaje();
        enemigo.setDefendiendo(false);
        if (danio >= 0) {
          enemigo.setVida(enemigo.getVida() - danio);
        }
      } else {
        enemigo.setVida(enemigo.getVida() - this.ataque);
      }
    }
  }

  public void defender() {
    this.defendiendo = true;
  }

  public Object generarNave() throws CloneNotSupportedException {

    try {
      Nave copia = (Nave) this.clone();
      Random r = new Random();
      copia.setAtaque(100 + r.nextInt(2000));
      copia.setBlindaje(100 + r.nextInt(800));
      copia.setVelocidad(1 + r.nextInt(7));
      copia.setVida(50 + r.nextInt(3000));
      return copia;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public void powerUp() {
    Iterator<PowerUp> ite = poderes.iterator();
    if (ite.hasNext()) {
      PowerUp activo = ite.next();
      activo.comportamientoAtaque(this);
      activo.comportamientoDefensa(this);
    }
  }
}
