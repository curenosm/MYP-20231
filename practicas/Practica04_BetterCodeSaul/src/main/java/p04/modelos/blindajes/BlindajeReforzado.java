package main.java.p04.modelos.blindajes;

import java.math.BigDecimal;

/**
 * Clase que representa un blindaje reforzado. Extiende de la clase Blindaje.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class BlindajeReforzado extends Blindaje {

  /** Metodo constructor sin parametros de la clase */
  public BlindajeReforzado() {
    this.nombre = "Blindaje Reforzado.";
    this.descripcion =
        "Blindaje de 5 cm hecho de electrum y oro, capaz de resistir ataques de armas laser.";
    this.precio = new BigDecimal(6324.58);
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

   /**
   * Metodo para modificar la defensa de la nave
   * @return int
   */
  @Override
  public int defensa() {
    return 1500;
  }

   /**
   * Metodo para modificar el peso de la nave
   * @return int
   */
  @Override
  public int peso() {
    return 700;
  }
}
