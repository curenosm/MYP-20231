package main.java.p03.pizzas;

/**
 * Clase que simula a una pizza de pollo. Extiende de Pizza.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class PizzaChicken extends Pizza {

  /** Metodo constructor sin parametros de la clase */
  public PizzaChicken() {
    this.carne = "pollo";
    this.queso = "manchego";
    this.masa = "delgada";
    this.precio = 140.30;
  }
}
