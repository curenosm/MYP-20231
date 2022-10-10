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

  public abstract int ataque();

  public int defensa() {
    return 0;
  }

  public int velocidad() {
    return 0;
  }
}
