package main.java.p03.modelos;

public class Cebolla extends BaguetteDecorador {

  public Cebolla(Baguette pan) {
    super(pan);
  }

  public String getDescripcion() {
    return pan.getDescripcion() + ",cebolla";
  }

  public double getPrecio() {
    return pan.getPrecio() + 1.2;
  }
}
