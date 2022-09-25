package main.java.p03.waysub;

import static main.java.p03.util.Constantes.redondear;

/**
 * Clase que simula el ingrediente pollo. Extiende de BaguetteDecorador
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class Pollo extends BaguetteDecorador {

  /**
   * Constructor con parametros de la clase
   *
   * @param pan Instancia de la clase Baguette
   */
  public Pollo(Baguette pan) {
    super(pan);
    this.ingrediente = "Pollo";
    this.precioIndividual = 12.5;
  }

  /**
   * Metodo que devuelve la descripcion del atributo pan de la clase y el ingrediente pollo
   *
   * @return String
   */
  public String getDescripcion() {
    return pan.getDescripcion()
        + "\n - "
        + this.ingrediente
        + "\t$"
        + redondear(this.precioIndividual);
  }

  /**
   * Metodo para obtener el precio base del objeto pan y sumarle el precio del ingrediente pollo
   *
   * @return double
   */
  public double getPrecio() {
    return pan.getPrecio() + this.precioIndividual;
  }
}
