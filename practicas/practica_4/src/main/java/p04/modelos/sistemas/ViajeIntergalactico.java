package main.java.p04.modelos.sistemas;

import java.math.BigDecimal;

/**
 * Clase que representa un sistema de propulsion para viajes intergalacticos. Extiende de la clase
 * SistemaDePropulsion.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class ViajeIntergalactico extends SistemaDePropulsion {

  /** Metodo constructor sin parametros de la clase */
  public ViajeIntergalactico() {
    this.nombre = "Viaje Intergalactico.";
    this.descripcion = "Sistema de propulsion que permite desplazarse a otras galaxias";
    this.precio = new BigDecimal(9914.89);
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
