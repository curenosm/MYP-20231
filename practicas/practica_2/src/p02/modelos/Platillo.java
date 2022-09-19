package p02.modelos;

import static p02.util.Printer.*;

/**
 * Clase que representa un producto a ser preparado.
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public abstract class Platillo {

    protected Long id;

    Platillo(Long id) {
        this.id = id;
    }

    /**
     * Metodo template que ejecuta  de preparacion
     */
    public void preparar() {
        success("SE ESTA PREPARANDO EL PEDIDO:");
        
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
        warning("COLOCANDO EL PAN");
    }

    public abstract void ponerMayonesa();
    
    public void ponerMostaza() {
        warning("UNTANDO LA MOSTAZA");
    }

    public abstract void ponerCarne();

    public abstract void ponerQueso();

    public void ponerVegetales() {
        warning("PONIENDOLE LOS VEGETALES");
    }

    public boolean esVegetariano() {
        return true;
    }

    public boolean llevaQueso() {
        return false;
    }

    public void ponerCatsup() {
        warning("PONIENDOLE CATSUP");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
