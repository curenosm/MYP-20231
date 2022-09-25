package main.java.p03.pizzas;

/**
 * Clase que simula a una pizza de salchicha. Extiende de pizza.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class PizzaSalchicha extends Pizza {

  /** Metodo constructor sin parametros de la clase */
  public PizzaSalchicha() {
    this.carne = "salchicha";
    this.queso = "manchego";
    this.masa = "delgada";
    this.precio = 169.69;
  }
}
