package main.java.p03.modelos;

public class Pollo extends BaguetteDecorador {

    public Pollo(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ",pollo";
    }

    public double getPrecio() {
        return pan.getPrecio()+12.5;
    }
}