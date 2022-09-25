package main.java.p03.modelos;

/**
 * Clase que sirve para agregar ingredientes a una instancia de la clase Baguette. Extiende de
 * Baguette
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public abstract class BaguetteDecorador extends Baguette {

  protected Baguette pan;
  protected String ingrediente;

  /**
   * Constructor con parametros de la clase
   *
   * @param pan Instancia de la clase Baguette a decorar
   */
  public BaguetteDecorador(Baguette pan) {
    this.pan = pan;
  }

  /**
   * Metodo para obtener la descripcion del baguette
   *
   * @return String
   */
  @Override
  public String getDescripcion() {
    return pan.getDescripcion();
  }

  /**
   * Metodo para obtener el precio del baguette
   *
   * @return double
   */
  @Override
  public double getPrecio() {
    return pan.getPrecio();
  }
}
