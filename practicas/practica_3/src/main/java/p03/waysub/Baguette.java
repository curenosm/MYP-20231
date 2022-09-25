package main.java.p03.waysub;

/**
 * Clase que simula un Baguette
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public abstract class Baguette {

  protected String descripcion = "";
  protected double precio = 0;

  /**
   * Metodo para obtener la descripcion del baguette
   *
   * @return String
   */
  public String getDescripcion() {
    return this.descripcion + "\n";
  }

  /**
   * Metodo para obtener el precio del baguette
   *
   * @return double
   */
  public double getPrecio() {
    return this.precio;
  }
}
