package main.java.p03.modelos;

public abstract class Baguette {

  protected String descripcion = "";
  protected double precio = 0;

  public String getDescripcion() {
    return this.descripcion;
  }

  public double getPrecio() {
    return this.precio;
  }
}
