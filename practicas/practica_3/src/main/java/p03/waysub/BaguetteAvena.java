package main.java.p03.waysub;

/**
 * Clase que simula un baguette con pan de avena. Extiende de la clase Baguette
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class BaguetteAvena extends Baguette {

  /** Metodo constructor sin parametros de la clase */
  public BaguetteAvena() {
    this.descripcion = "Baguette con pan de avena";
    this.precio = 50;
  }

  /**
   * Metodo para obtener el precio del baguette de pan de avena
   *
   * @return double
   */
  @Override
  public double getPrecio() {
    return this.precio;
  }
}
