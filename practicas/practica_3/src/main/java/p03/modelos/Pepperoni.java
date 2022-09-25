package main.java.p03.modelos;

public class Pepperoni extends BaguetteDecorador {

  public Pepperoni(Baguette pan) {
    super(pan);
  }

  public String getDescripcion() {
    return pan.getDescripcion() + ",pepperoni";
  }

  public double getPrecio() {
    return pan.getPrecio() + 10.8;
  }
}
