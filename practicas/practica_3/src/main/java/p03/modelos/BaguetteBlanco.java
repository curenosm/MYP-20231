package main.java.p03.modelos;

public class BaguetteBlanco extends Baguette {

    public BaguetteBlanco() {
        this.descripcion="Baguette con pan blanco";
        this.precio= 30;
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