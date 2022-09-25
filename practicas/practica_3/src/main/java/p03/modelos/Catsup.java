package main.java.p03.modelos;

/**
 * Clase que simula el ingrediente catsup Extiende de BaguetteDecorador
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class Catsup extends BaguetteDecorador {

  /**
   * Constructor con parametros de la clase
   *
   * @param pan Instancia de la clase Baguette
   */
  public Catsup(Baguette pan) {
    super(pan);
    this.ingrediente = "Catsup";
  }

  /**
   * Metodo que devuelve la descripcion del atributo pan de la clase y el ingrediente catsup
   *
   * @return String
   */
  public String getDescripcion() {
    return pan.getDescripcion() + "\n - " + this.ingrediente;
  }

  /**
   * Metodo para obtener el precio base del objeto pan y sumarle el precio del ingrediente catsup
   *
   * @return double
   */
  public double getPrecio() {
    return pan.getPrecio() + 3;
  }
}
