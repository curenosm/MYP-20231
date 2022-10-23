package main.java.p03.waysub;

/**
 * Metodo que simula a un baguette de plan blanco. Extiende de Baguette
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class BaguetteBlanco extends Baguette {

  /** Metodo constructor sin parametros de la clase */
  public BaguetteBlanco() {
    this.descripcion = "Baguette con pan blanco";
    this.precio = 30;
  }

  /**
   * Metodo para obtener el precio del baguette de pan blanco
   *
   * @return double
   */
  @Override
  public double getPrecio() {
    return this.precio;
  }
}
