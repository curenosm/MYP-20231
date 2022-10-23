package main.java.p04.modelos.armas;

import java.math.BigDecimal;
import main.java.p04.modelos.Componente;

/**
 * Clase abstracta que representa el arma de una nave. Implementa la interfaz Componente.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public abstract class Arma implements Componente {
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
 * Metodo abstracto para modificar el ataque de la nave
 */
  public abstract int ataque();

  /**
   * Metodo para modificar la defensa de la nave
   * @return int
   */
  public int defensa() {
    return 0;
  }

   /**
   * Metodo para modificar la velocidad de la nave
   * @return int
   */
  public int velocidad() {
    return 0;
  }
}
