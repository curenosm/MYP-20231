package main.java.p04.modelos.armas;

import java.math.BigDecimal;

/**
 * Clase que representa un arma laser simple. Extiende de la clase Arma.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class ArmaLaserSimple extends Arma {

  /** Metodo constructor sin parametros de la clase */
  public ArmaLaserSimple() {
    this.precio = new BigDecimal(563.21);
    this.descripcion = "Arma de un solo canion que dispara rafagas laser a gran velocidad.";
    this.nombre = "Arma Laser Simple.";
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
  public int ataque(){
    return 200;
  }

  @Override
  public int peso(){
    return 70;
  }
}
