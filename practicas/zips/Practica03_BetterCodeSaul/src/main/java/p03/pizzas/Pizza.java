package main.java.p03.pizzas;

/**
 * Clase que simula a una pizza
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Pizza {
  protected String queso;
  protected String carne;
  protected String masa;
  protected double precio;
  protected String nombre;

  /**
   * Metodo para obtener el tipo de queso de la pizza
   *
   * @return String
   */
  public String getQueso() {
    return this.queso;
  }

  /**
   * Metodo para obtener el tipo de carne de la pizza
   *
   * @return String
   */
  public String getCarne() {
    return this.carne;
  }

  /**
   * Metodo para obtener el tipo de masa de la pizza
   *
   * @return String
   */
  public String getMasa() {
    return this.masa;
  }

  /**
   * Metodo para obtener el precio de la pizza
   *
   * @return double
   */
  public double getPrecio() {
    return this.precio;
  }

  /**
   * Representancion en cadena de la clase
   *
   * @return String
   */
  @Override
  public String toString() {
    String res = "Pizza " + this.nombre + "\n";
    res += "\n - Masa " + getMasa();
    res += "\n - Queso " + getQueso();
    res += "\n - Carne " + getCarne();
    return res;
  }
}
