package main.java.p04.modelos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import main.java.p04.modelos.armas.*;
import main.java.p04.modelos.blindajes.*;
import main.java.p04.modelos.cabinas.*;
import main.java.p04.modelos.sistemas.*;

/**
 * Clase que simula una Nave que se conforma de varias y distintas instancias de la clase componente
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Nave {

  private int ataque;
  private int defensa;
  private int velocidad;
  private int peso;
  private Componente arma;
  private Componente blindaje;
  private Componente cabina;
  private Componente sistemaDePropulsion;

  /**
   * Constructor con parametros de la clase
   *
   * @param arma Instancia de la clase Arma
   * @param blindaje Instancia de la clase Blindaje
   * @param cabina Instancia de la clase Cabina
   * @param sistema Instancia de la clase SistemaDePropulsion
   */
  public Nave(Componente arma, Componente blindaje, Componente cabina, Componente sistema) {
    this.arma = arma;
    this.blindaje = blindaje;
    this.cabina = cabina;
    this.sistemaDePropulsion = sistema;
    this.peso = 600 + arma.peso() + blindaje.peso() + cabina.peso() + sistema.peso();
    this.ataque = 50 + arma.ataque();
    this.defensa = 200 + cabina.defensa() + blindaje.defensa();
    this.velocidad = 100 + sistema.velocidad();
  }

  /** Metodo constructor sin parametros de la clase */
  public Nave() {
    arma = new ArmaLaserSimple();
    blindaje = new BlindajeFortaleza();
    cabina = new Cabina1Piloto();
    sistemaDePropulsion = new ViajeIntercontinental();
  }

  /**
   * Metodo para obtener el costo total de la nave
   *
   * @return BigDecimal
   */
  public BigDecimal obtenerCosto() {

    BigDecimal total = BigDecimal.ZERO;

    total = total.add(arma.precio());
    total = total.add(blindaje.precio());
    total = total.add(cabina.precio());
    total = total.add(sistemaDePropulsion.precio());
    BigDecimal totalRedondeado = total.setScale(2, RoundingMode.HALF_UP);
    return totalRedondeado;
  }

  /**
   * Metodo para obtener el valor del atributo arma
   *
   * @return Componente
   */
  public Componente getArma() {
    return arma;
  }

  /**
   * Metodo para modificar el valor del atributo arma
   *
   * @param sistemaDePropulsion Instancia de la clase Componente
   */
  public void setArma(Componente arma) {
    this.arma = arma;
  }

  /**
   * Metodo para obtener el valor del atributo blindaje
   *
   * @return Componente
   */
  public Componente getBlindaje() {
    return blindaje;
  }

  /**
   * Metodo para modificar el valor del atributo blindaje
   *
   * @param sistemaDePropulsion Instancia de la clase Componente
   */
  public void setBlindaje(Componente blindaje) {
    this.blindaje = blindaje;
  }

  /**
   * Metodo para obtener el valor del atributo cabina
   *
   * @return Componente
   */
  public Componente getCabina() {
    return cabina;
  }

  /**
   * Metodo para modificar el valor del atributo cabina
   *
   * @param sistemaDePropulsion Instancia de la clase Componente
   */
  public void setCabina(Componente cabina) {
    this.cabina = cabina;
  }

  /**
   * Metodo para obtener el valor del atributo sistemaDePropulsion
   *
   * @return Componente
   */
  public Componente getSistemaDePropulsion() {
    return sistemaDePropulsion;
  }

  /**
   * Metodo para modificar el valor del atributo sistemaDePropulsion
   *
   * @param sistemaDePropulsion Instancia de la clase Componente
   */
  public void setSistemaDePropulsion(Componente sistemaDePropulsion) {
    this.sistemaDePropulsion = sistemaDePropulsion;
  }

  /**
   * Representacion en cadena de la clase
   *
   * @return String
   */
  @Override
  public String toString() {

    calcularEstadisticas();
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
        + "\n"
        + "Peso: "
        + this.peso
        + " kilogramos\n"
        + "Ataque: "
        + this.ataque
        + " ataquits\n"
        + "Defensa: "
        + this.defensa
        + " defendits \n"
        + "Velocidad: "
        + this.velocidad
        + " parsecs\n";
  }

  private void calcularEstadisticas() {
    this.peso =
        600
            + this.arma.peso()
            + this.blindaje.peso()
            + this.cabina.peso()
            + this.sistemaDePropulsion.peso();
    this.ataque = 50 + this.arma.ataque();
    this.defensa = 200 + this.cabina.defensa() + this.blindaje.defensa();
    this.velocidad = 100 + this.sistemaDePropulsion.velocidad();
  }
}
