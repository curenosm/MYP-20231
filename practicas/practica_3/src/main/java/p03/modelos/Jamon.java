package main.java.p03.modelos;

public class Jamon extends BaguetteDecorador {

  public Jamon(Baguette pan) {
    super(pan);
  }

  public String getDescripcion() {
    return pan.getDescripcion() + ",jamon";
  }

  public double getPrecio() {
    return pan.getPrecio() + 8.5;
  }
}
