package main.java.p04.modelos;

import java.math.BigDecimal;
import main.java.p04.modelos.armas.*;
import main.java.p04.modelos.blindajes.*;
import main.java.p04.modelos.cabinas.*;
import main.java.p04.modelos.sistemas.*;

public class Nave {

  private Componente arma;
  private Componente blindaje;
  private Componente cabina;
  private Componente sistemaDePropulsion;

  public Nave(Arma arma, Blindaje blindaje, Cabina cabina, SistemaDePropulsion sistema) {
    this.arma = arma;
    this.blindaje = blindaje;
    this.cabina = cabina;
    this.sistemaDePropulsion = sistema;
  }

  public Nave() {
    arma = new ArmaLaserSimple();
    blindaje = new BlindajeFortaleza();
    cabina = new Cabina1Piloto();
    sistemaDePropulsion = new ViajeIntercontinental();
  }

  public BigDecimal obtenerCosto() {

    BigDecimal total = BigDecimal.ZERO;

    total = total.add(arma.precio());
    total = total.add(blindaje.precio());
    total = total.add(cabina.precio());
    total = total.add(sistemaDePropulsion.precio());

    return total;
  }

  public Componente getArma() {
    return arma;
  }

  public void setArma(Componente arma) {
    this.arma = arma;
  }

  public Componente getBlindaje() {
    return blindaje;
  }

  public void setBlindaje(Componente blindaje) {
    this.blindaje = blindaje;
  }

  public Componente getCabina() {
    return cabina;
  }

  public void setCabina(Componente cabina) {
    this.cabina = cabina;
  }

  public Componente getSistemaDePropulsion() {
    return sistemaDePropulsion;
  }

  public void setSistemaDePropulsion(Componente sistemaDePropulsion) {
    this.sistemaDePropulsion = sistemaDePropulsion;
  }

  @Override
  public String toString() {

    BigDecimal costo = obtenerCosto();
    return ""
        + "Sistema de propulsion: "
        + this.sistemaDePropulsion
        + "\n"
        + "Armas: "
        + this.arma
        + "\n"
        + "Cabina: "
        + this.cabina
        + "\n"
        + "Blindaje: "
        + this.blindaje
        + "\n";
  }
}
