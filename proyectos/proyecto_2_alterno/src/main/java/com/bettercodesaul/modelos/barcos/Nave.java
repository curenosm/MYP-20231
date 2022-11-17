package com.bettercodesaul.modelos.barcos;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.powerups.PowerUp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nave implements Cloneable {

  protected String tipo = "";
  protected Long id = 000L;
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

  public Nave() {
    this.poderes = new ArrayList<PowerUp>();
  }

  public Nave(Componente arma, Componente coraza, Componente emblema) {
    this.arma = arma;
    this.coraza = coraza;
    this.emblema = emblema;
    this.poderes = new ArrayList<PowerUp>();
  }

  public String toString() {
    String s = "";
    for (PowerUp power : this.poderes) {
      s += "\n" + power.nombre();
    }
    s +=
        "Clase: "
            + this.tipo
            + "\nAtaque: "
            + this.ataque
            + "\nVida: "
            + this.vida
            + "\nDefensa: "
            + this.blindaje
            + "\nAgilidad: "
            + this.agilidad
            + "\nVelocidad: "
            + this.velocidad;

    if (this.arma != null) s += "\nArma: " + this.arma.getNombre();

    if (this.coraza != null) s += "\nBlindaje: " + this.coraza.getNombre();

    if (this.emblema != null) s += "\nEmblema: " + this.emblema.getNombre();

    return s;
  }

  public Long getId() {
    return this.id;
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
    if (vida < 0) this.vida = 0;

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
      success(property("messages.ataque.acertado"));
      if (enemigo.getDefendiendo()) {
        bold(property("messages.ataque.defendido"));
        int danio = this.ataque - enemigo.getBlindaje();
        bold(property("messages.ataque.danio") + danio);
        enemigo.setDefendiendo(false);
        if (danio >= 0) {
          enemigo.setVida(enemigo.getVida() - danio);
          warning(property("messages.objetivo.vida") + enemigo.getVida());
        } else {
          warning(property("messages.ataque.danio" + 0));
        }
      } else {
        enemigo.setVida(enemigo.getVida() - this.ataque);
        bold(property("messages.ataque.danio") + this.ataque);
        warning(property("messages.objetivo.vida") + enemigo.getVida());
      }
    } else {
      warning(property("message.ataque.esquivado"));
    }
  }

  public void defender() {
    this.defendiendo = true;
  }

  public Object generarNave() throws CloneNotSupportedException {

    try {
      Nave copia = (Nave) this.clone();
      Random r = new Random();
      copia.setAtaque(this.ataque + random(0, 3201));
      copia.setBlindaje(this.blindaje + random(0, 1200));
      copia.setVelocidad(this.velocidad + random(0, 7));
      copia.setVida(this.vida + r.nextInt(3000));
      return copia;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void powerUp() {
    if (!poderes.isEmpty()) {
      PowerUp activo = this.poderes.get(0);
      activo.comportamientoAtaque(this);
      activo.comportamientoDefensa(this);
    }
  }
}
