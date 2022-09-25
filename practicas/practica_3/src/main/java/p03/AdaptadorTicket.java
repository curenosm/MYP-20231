package main.java.p03;

import main.java.p03.pizzas.Pizza;
import main.java.p03.waysub.Baguette;

/**
 * Clase adaptadora que nos ayuda a servir de interfaz entre el subsistema de las pizzas y el de los
 * baguettes para estandarizar los tickets.
 *
 * @author
 */
public class AdaptadorTicket {

  private final Pizza pizza;
  private final Baguette baguette;

  public AdaptadorTicket(Pizza pizza) {
    this.pizza = pizza;
    this.baguette = null;
  }

  public AdaptadorTicket(Baguette baguette) {
    this.pizza = null;
    this.baguette = baguette;
  }

  public String getDescripcion() {

    if (baguette != null) return baguette.getDescripcion();

    String res = "";

    if (pizza != null) {
      res += pizza.toString();
    }

    return res;
  }

  public double getPrecio() {
    return (pizza != null) ? pizza.getPrecio() : baguette.getPrecio();
  }
}
