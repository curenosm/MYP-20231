package main.java.p04.modelos;

/**
 * Clase para construir y sustituir piezas de un objeto complejo
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Eizabeth
 */
public class Builder {

  protected Componente arma;
  protected Componente blindaje;
  protected Componente cabina;
  protected Componente sistemaDePropulsion;

  /**
   * COnstructor sin parametros de la clase
   */
  public Builder() {}

  /**
   * Constructor con parametros de la clase
   * @param arma Instancia de la clase Componente
   * @param blindaje Instancia de la clase Componente
   * @param cabina Instancia de la clase Componente
   * @param sistema Instancia de la clase Componente
   */
  public Builder(Componente arma, Componente blindaje, Componente cabina, Componente sistema) {
    this.arma = arma;
    this.blindaje = blindaje;
    this.cabina = cabina;
    this.sistemaDePropulsion = sistema;
  }

  /**
   * Metodo para construir una nave de acuerdo a los elementos que tiene el Builder
   * @return Nave
   */
  public Nave build() {
    return new Nave(this.arma, this.blindaje, this.cabina, this.sistemaDePropulsion);
  }

  /**
   * Metodo para modificar el atributo arma de la clase
   * @param arma Instancia de la clase Componente
   * @return Builder
   */
  public Builder arma(Componente arma) {
    this.arma = arma;
    return this;
  }


  /**
   * Metodo para modificar el atributo blindaje de la clase
   * @param arma Instancia de la clase Componente
   * @return Builder
   */
  public Builder blindaje(Componente blindaje) {
    this.blindaje = blindaje;
    return this;
  }


  /**
   * Metodo para modificar el atributo cabina de la clase
   * @param arma Instancia de la clase Componente
   * @return Builder
   */
  public Builder cabina(Componente cabina) {
    this.cabina = cabina;
    return this;
  }


  /**
   * Metodo para modificar el atributo sistemaDePropulsion de la clase
   * @param arma Instancia de la clase Componente
   * @return Builder
   */
  public Builder sistemaDePropulsion(Componente sistemaDePropulsion) {
    this.sistemaDePropulsion = sistemaDePropulsion;
    return this;
  }
}
