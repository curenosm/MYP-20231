package main.java.p04.modelos.blindajes;

import java.math.BigDecimal;

/**
 * Clase que representa un blindaje simple. Extiende de la clase Blindaje.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class BlindajeSimple extends Blindaje {

  /** Metodo constructor sin parametros de la clase */
  public BlindajeSimple() {
    this.nombre = "Blindaje Simple.";
    this.descripcion = "Blindaje ligero hecho con acero. Resulta ligero y sutil.";
    this.precio = new BigDecimal(1111.11);
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
  public int defensa(){
    return 700;
  }

  @Override
  public int peso(){
    return 320;
  }
}
