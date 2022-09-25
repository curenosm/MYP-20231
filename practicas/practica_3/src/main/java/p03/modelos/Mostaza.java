package main.java.p03.modelos;

public class Mostaza extends BaguetteDecorador {

  public Mostaza(Baguette pan) {
    super(pan);
  }

  public String getDescripcion() {
    return pan.getDescripcion() + ",mostaza";
  }

  public double getPrecio() {
    return pan.getPrecio() + 2;
  }
}
