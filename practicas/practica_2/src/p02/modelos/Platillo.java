package p02.modelos;

import static p02.util.Printer.*;
public abstract class Platillo {

    protected Long id;

    Platillo(Long id) {
        this.id = id;
    }

    public void preparar() {
        println("SE ESTÁ PREPARANDO EL PEDIDO:");
        
        ponerPan();

        if (!esVegetariano()) {
            ponerMayonesa();
        }

        ponerMostaza();

        if (!esVegetariano()) {
            ponerCarne();
        }

        if (llevaQueso() && !esVegetariano()) {
            ponerQueso();    
        }
        
        ponerVegetales();
        ponerCatsup();
        ponerPan();
    }

    public void ponerPan() {
        success("COLOCANDO EL PAN");
    }

    public abstract void ponerMayonesa();
    
    public void ponerMostaza() {
        success("UNTANDO LA MOSTAZA");
    }

    public abstract void ponerCarne();

    public abstract void ponerQueso();

    public void ponerVegetales() {
        println("PONIENDOLE LOS VEGETALES");
    }

    public boolean esVegetariano() {
        return true;
    }

    public boolean llevaQueso() {
        return false;
    }

    public void ponerCatsup() {
        println("PONIENDOLE CATSUP");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
