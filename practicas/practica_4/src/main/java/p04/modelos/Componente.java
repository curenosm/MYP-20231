package main.java.p04.modelos;

import java.math.BigDecimal;

/**
 * Interfaz que representa un componente que forma parte de una nave
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public interface Componente {
  public String nombre();

  public String descripcion();

  public BigDecimal precio();

  public int peso();
  public int velocidad();
  public int ataque();
  public int defensa();
}
