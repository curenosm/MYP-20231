package main.java.p03.waysub;

import static main.java.p03.util.Constantes.redondear;

/**
 * Clase que simula el ingrediente pepperoni. Extiende de BaguetteDecorador
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class Pepperoni extends BaguetteDecorador {

  /**
   * Constructor con parametros de la clase
   *
   * @param pan Instancia de la clase Baguette
   */
  public Pepperoni(Baguette pan) {
    super(pan);
    this.ingrediente = "Pepperoni";
    this.precioIndividual = 10.8;
  }

  /**
   * Metodo que devuelve la descripcion del atributo pan de la clase y el ingrediente pepperoni
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
   * Metodo para obtener el precio base del objeto pan y sumarle el precio del ingrediente pepperoni
   *
   * @return double
   */
  public double getPrecio() {
    return pan.getPrecio() + this.precioIndividual;
  }
}
