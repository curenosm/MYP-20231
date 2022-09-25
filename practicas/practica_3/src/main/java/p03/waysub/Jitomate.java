package main.java.p03.waysub;

/**
 * Clase que simula el ingrediente jitomate. Extiende de BaguetteDecorador
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class Jitomate extends BaguetteDecorador {

  /**
   * Constructor con parametros de la clase
   *
   * @param pan Instancia de la clase Baguette
   */
  public Jitomate(Baguette pan) {
    super(pan);
    this.ingrediente = "Jitomate";
  }

  /**
   * Metodo que devuelve la descripcion del atributo pan de la clase y el ingrediente jitomate
   *
   * @return String
   */
  public String getDescripcion() {
    return pan.getDescripcion() + "\n - " + this.ingrediente;
  }

  /**
   * Metodo para obtener el precio base del objeto pan y sumarle el precio del ingrediente jitomate
   *
   * @return double
   */
  public double getPrecio() {
    return pan.getPrecio() + 2.5;
  }
}
