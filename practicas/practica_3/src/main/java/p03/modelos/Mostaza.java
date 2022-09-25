package main.java.p03.modelos;

/**
 * Clase que simula el ingrediente mostaza. Extiende de BaguetteDecorador
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class Mostaza extends BaguetteDecorador {

  /**
   * Constructor con parametros de la clase
   *
   * @param pan Instancia de la clase Baguette
   */
  public Mostaza(Baguette pan) {
    super(pan);
  }

  /**
   * Metodo que devuelve la descripcion del atributo pan de la clase y el ingrediente mostaza
   *
   * @return String
   */
  public String getDescripcion() {
    return pan.getDescripcion() + ",mostaza";
  }

  /**
   * Metodo para obtener el precio base del objeto pan y sumarle el precio del ingrediente mostaza
   *
   * @return double
   */
  public double getPrecio() {
    return pan.getPrecio() + 2;
  }
}
