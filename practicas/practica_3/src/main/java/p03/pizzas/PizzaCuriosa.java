package main.java.p03.pizzas;

/**
 * Clase que simula a una pizza de pollo y queso cheddar. Extiende de Pizza.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class PizzaCuriosa extends Pizza {

  /** Metodo constructor sin parametros de la clase */
  public PizzaCuriosa() {
    this.nombre = "Curiosa";
    this.carne = "pollo";
    this.queso = "cheddar";
    this.masa = "gruesa";
    this.precio = 177.89;
  }
}
