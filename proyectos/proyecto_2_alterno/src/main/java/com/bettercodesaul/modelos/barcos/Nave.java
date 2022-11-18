package com.bettercodesaul.modelos.barcos;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.powerups.PowerUp;
import java.util.ArrayList;
import java.util.List;

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
  protected int contador = 0;

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
    s += "\nPoderes";
    for (PowerUp power : this.poderes) {
      s += "\n" + power.nombre();
    }

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

    int valorDado = random(this.agilidad, 13);
    if (this.agilidad >= valorDado) {
      return true;
    } else {
      return false;
    }
  }

  public String atacar(Nave enemigo) {

    if (enemigo.esquivar()) {

      if (enemigo.getDefendiendo()) {

        int danio = this.ataque - enemigo.getBlindaje();

        enemigo.setDefendiendo(false);
        if (danio >= 0) {
          enemigo.setVida(enemigo.getVida() - danio);
          return property("messages.ataque.acertado")
              + "\n"
              + property("messages.ataque.defendido")
              + "\n"
              + property("messages.ataque.danio")
              + danio
              + "\n"
              + property("messages.objetivo.vida")
              + enemigo.getVida();

        } else {
          return property("messages.ataque.acertado")
              + "\n"
              + property("messages.ataque.defendido")
              + "\n"
              + property("messages.ataque.danio")
              + 0;
        }
      } else {
        enemigo.setVida(enemigo.getVida() - this.ataque);
        return property("messages.ataque.acertado")
            + "\n"
            + property("messages.ataque.danio")
            + this.ataque
            + "\n"
            + property("messages.objetivo.vida")
            + enemigo.getVida();
      }
    } else {
      return property("message.ataque.esquivado");
    }
  }

  public void defender() {
    this.defendiendo = true;
  }

  public Object generarNave() throws CloneNotSupportedException {

    try {
      Nave copia = (Nave) this.clone();

      copia.setAtaque(random(100, 1201));
      copia.setBlindaje(random(0, 501));
      copia.setVelocidad(random(1, 6));
      copia.setVida(random(800, 3001));
      copia.setAgilidad(random(0, 6));
      return copia;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  public String powerUp() {
    if (contador < this.poderes.size()) {
      PowerUp activo = this.poderes.get(contador);

      activo.comportamientoAtaque(this);
      activo.comportamientoDefensa(this);
      contador++;
      return activo.nombre() + ": " + activo.descripcion();
    }
    return property("messages.powerup.vacio");
  }
}
