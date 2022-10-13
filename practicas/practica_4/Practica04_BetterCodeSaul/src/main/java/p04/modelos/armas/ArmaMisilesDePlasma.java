package main.java.p04.modelos.armas;

import java.math.BigDecimal;

/**
 * Clase que representa un arma de misiles de plasma. Extiende de la clase Arma.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class ArmaMisilesDePlasma extends Arma {

  /** Metodo constructor sin parametros de la clase */
  public ArmaMisilesDePlasma() {
    this.precio = new BigDecimal(4827.63);
    this.descripcion =
        "Arma que arroja tandas de 4 misiles de plasma que rastrean y persiguen al objetivo"
            + " designado.";
    this.nombre = "Arma Misiles de Plasma.";
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
   * Metodo para modificar el ataque de la nave
   * @return int
   */
  @Override
  public int ataque() {
    return 1000;
  }

   /**
   * Metodo para modificar el peso de la nave
   * @return int
   */
  @Override
  public int peso() {
    return 160;
  }
}
