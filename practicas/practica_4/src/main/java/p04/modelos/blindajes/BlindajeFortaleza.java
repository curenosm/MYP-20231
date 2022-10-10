package main.java.p04.modelos.blindajes;

import java.math.BigDecimal;

/**
 * Clase que representa un blindaje de fortaleza. Extiende de la clase Blindaje.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class BlindajeFortaleza extends Blindaje {

  /** Metodo constructor sin parametros de la clase */
  public BlindajeFortaleza() {
    this.nombre = "Blindaje Fortaleza.";
    this.descripcion =
        "Blindaje hecho con una aleacion de beskar y neuranio, cuenta con campos electromagneticos"
            + " que rodean la aleacion.";
    this.precio = new BigDecimal(14342.77);
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
    return 4000;
  }

  @Override
  public int peso() {
    return 1200;
  }
}
