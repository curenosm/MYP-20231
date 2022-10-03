package main.java.p04.modelos.armas;

import java.math.BigDecimal;

/**
 * Clase que representa un arma destructora de planetas. Extiende de la clase Arma.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class ArmaLaserDestructorDePlanetas extends Arma {

  /** Metodo constructor sin parametros de la clase */
  public ArmaLaserDestructorDePlanetas() {
    this.precio = new BigDecimal(12500.83);
    this.descripcion =
        "Arma con cuatro caniones cuanticos que implementan cristales kyber para generar un solo"
            + " rayo con el poder para destruir planetas.";
    this.nombre = "Arma Laser Destructor de Planetas.";
  }

  /**
   * Metodo para obtener el nombre de la clase
   *
   * @return String
   */
  @Override
  public String nombre() {
    return this.nombre;
  }

  /**
   * Metodo para obtener la descripcion de esta pieza
   *
   * @return String
   */
  @Override
  public String descripcion() {
    return this.descripcion;
  }

  /**
   * Metodo que devuelve el precio del componente
   *
   * @return BigDecimal
   */
  @Override
  public BigDecimal precio() {
    return this.precio;
  }
}
