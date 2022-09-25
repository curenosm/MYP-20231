package main.java.p03.waysub;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

  /**
   * Metodo que determina si se puede agregar una ocurrencia mas al baguette de un ingrediente
   * determinado, utiliza expresiones regulares. Si hay mas de 3 ocurrencias de un mismo
   * ingrediente, el pedido no es valido
   *
   * @param ingrediente
   * @return
   */
  public boolean puedoAgregarIngrediente(String ingrediente) {
    Pattern pattern = Pattern.compile(ingrediente, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(this.getDescripcion());

    return matcher.results().count() < 3;
  }
}
