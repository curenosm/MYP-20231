package main.java.p04.modelos.cabinas;

import java.math.BigDecimal;
import main.java.p04.modelos.Componente;

/**
 * Clase abstracta que representa la cabina de una nave. Implementa la interfaz Componente.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public abstract class Cabina implements Componente {
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

  public abstract int defensa();

  public int ataque() {
    return 0;
  }

  public int velocidad() {
    return 0;
  }
}
