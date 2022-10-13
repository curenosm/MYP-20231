package main.java.p04.modelos.sistemas;

import java.math.BigDecimal;
import main.java.p04.modelos.Componente;

/**
 * Clase abstracta que representa el sistema de propulsion de una nave. Implementa la interfaz
 * Componente.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public abstract class SistemaDePropulsion implements Componente {
  protected BigDecimal precio;
  protected String descripcion;
  protected String nombre;

  /**
   * Representacion en cadena de la clase
   *
   * @return String
   */
  @Override
  public String toString() {
    String s = nombre + "\n" + descripcion;
    return s;
  }
/**
 * Metodo abstracto para modificar la velocidad de la nave
 * @return int
 */
  public abstract int velocidad();

   /**
   * Metodo para modificar el ataque de la nave
   * @return int
   */
  public int ataque() {
    return 0;
  }

   /**
   * Metodo para modificar la defensa de la nave
   * @return int
   */
  public int defensa() {
    return 0;
  }
}
