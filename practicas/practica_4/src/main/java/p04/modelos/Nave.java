package main.java.p04.modelos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import main.java.p04.modelos.blindajes.BlindajeFortaleza;
import main.java.p04.modelos.cabinas.Cabina1Piloto;
import main.java.p04.modelos.sistemas.ViajeIntercontinental;

public class Nave {

  private List<Componente> armas;
  private Componente blindaje;
  private Componente cabina;
  private Componente sistemaDePropulsion;

  public Nave() {
    this.armas = new ArrayList<>();
    blindaje = new BlindajeFortaleza();
    cabina = new Cabina1Piloto();
    sistemaDePropulsion = new ViajeIntercontinental();
  }

  public BigDecimal obtenerCosto() {

    BigDecimal total = BigDecimal.ZERO;
    for (Componente arma : armas) {
      total = total.add(arma.precio());
    }

    total = total.add(blindaje.precio());
    total = total.add(cabina.precio());
    total = total.add(sistemaDePropulsion.precio());

    return total;
  }

  public List<Componente> getArmas() {
    return armas;
  }

  public void setArmas(List<Componente> armas) {
    this.armas = armas;
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
    return ""
        + "Sistema de propulsion: "
        + this.sistemaDePropulsion
        + "\n"
        + "Armas: "
        + this.armas
        + "\n"
        + "Cabina: "
        + this.cabina
        + "\n"
        + "Blindaje: "
        + this.blindaje
        + "\n";
  }
}
