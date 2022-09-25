package main.java.p03.modelos;

/**
 * Clase que simula el ingrediente mayonesa. Extiende de BaguetteDecorador
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class Mayonesa extends BaguetteDecorador {

  /**
   * Constructor con parametros de la clase
   *
   * @param pan Instancia de la clase Baguette
   */
  public Mayonesa(Baguette pan) {
    super(pan);
  }

  /**
   * Metodo que devuelve la descripcion del atributo pan de la clase y el ingrediente mayonesa
   *
   * @return String
   */
  public String getDescripcion() {
    return pan.getDescripcion() + ",mayonesa";
  }

  /**
   * Metodo para obtener el precio base del objeto pan y sumarle el precio del ingrediente mayonesa
   *
   * @return double
   */
  public double getPrecio() {
    return pan.getPrecio() + 2;
  }
}
