package main.java.p04.modelos.blindajes;

import java.math.BigDecimal;
import main.java.p04.modelos.Componente;

/**
 * Clase abstracta que representa el blindaje de una nave. Implementa la interfaz Componente.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public abstract class Blindaje implements Componente {
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
   * Metodo abstracto para modificar la defensa de la nave
   * @return int
   */
  public abstract int defensa();

   /**
   * Metodo para modificar el ataque de la nave
   * @return int
   */
  public int ataque() {
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
