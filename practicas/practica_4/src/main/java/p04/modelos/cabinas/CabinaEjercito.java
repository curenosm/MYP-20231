package main.java.p04.modelos.cabinas;

import java.math.BigDecimal;

/**
 * Clase que representa una cabina para un ejercito. Extiende de la clase Cabina.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class CabinaEjercito extends Cabina {

  /** Metodo constructor sin parametros de la clase */
  public CabinaEjercito() {
    this.nombre = "Cabina Ejercito.";
    this.descripcion = "Cabina creada para un ejercito extenso.";
    this.precio = new BigDecimal(4356.12);
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

  @Override
  public int defensa() {
    return 600;
  }

  @Override
  public int peso() {
    return 500;
  }
}
