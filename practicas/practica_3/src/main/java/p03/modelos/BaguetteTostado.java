package main.java.p03.modelos;

public class BaguetteTostado extends Baguette {

  public BaguetteTostado() {
    this.descripcion = "Baguette con pan tostado";
    this.precio = 40;
  }

  @Override
  public String getDescripcion() {
    return super.getDescripcion() + this.descripcion;
  }

  @Override
  public double getPrecio() {
    return super.precio + this.precio;
  }
}
