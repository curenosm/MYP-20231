package com.bettercodesaul.modelos;

import com.bettercodesaul.modelos.barcos.*;

/**
 * Clase para construir y sustituir piezas de un objeto complejo
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Eizabeth
 */
public class Builder {

  protected int tipo;
  protected Componente arma;
  protected Componente blindaje;
  protected Componente emblema;

  /** Constructor sin parametros de la clase */
  public Builder() {}

  /**
   * Constructor con parametros de la clase
   *
   * @param arma Instancia de la clase Componente
   * @param blindaje Instancia de la clase Componente
   * @param cabina Instancia de la clase Componente
   */
  public Builder(int tipo, Componente arma, Componente blindaje, Componente emblema) {
    this.tipo = tipo;
    this.arma = arma;
    this.blindaje = blindaje;
    this.emblema = emblema;
  }

  /**
   * Metodo para construir una nave de acuerdo a los elementos que tiene el Builder
   *
   * @return Nave
   */
  public Nave build() {
    switch (this.tipo) {
      case 1:
        return new Submarino(this.arma, this.blindaje, this.emblema);
      case 2:
        return new Acorazado(this.arma, this.blindaje, this.emblema);
      case 3:
        return new PortaAviones(this.arma, this.blindaje, this.emblema);
      default:
        return null;
    }
  }

  /**
   * Metodo para modificar el atributo arma de la clase
   *
   * @param arma Instancia de la clase Componente
   * @return Builder import static com.bettercodesaul.util.Printer.*;
   */
  public Builder arma(Componente arma) {
    this.arma = arma;
    return this;
  }

  /**
   * Metodo para modificar el atributo blindaje de la clase
   *
   * @param arma Instancia de la clase Componente
   * @return Builder
   */
  public Builder blindaje(Componente blindaje) {
    this.blindaje = blindaje;
    return this;
  }

  /**
   * Metodo para modificar el atributo cabina de la clase
   *
   * @param arma Instancia de la clase Componente
   * @return Builder
   */
  public Builder emblema(Componente emblema) {
    this.emblema = emblema;
    return this;
  }

  public Builder tipo(int tipo) {
    this.tipo = tipo;
    return this;
  }
}
