package main.java.p03.modelos;

public class PizzaAdapter extends Baguette {

  private Pizza pizza;

  public PizzaAdapter(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescripcion() {
    return "Pizza con masa"
        + pizza.getMasa()
        + ", queso "
        + pizza.getQueso()
        + " y "
        + pizza.getCarne();
  }

  @Override
  public double getPrecio() {
    return pizza.getPrecio();
  }
}
