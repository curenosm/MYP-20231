package p02.modelos;

import static p02.util.Printer.println;
import static p02.util.Printer.print;
public abstract class Preparacion {

    private Platillo platillo;

    public void preparar(Platillo platillo) {
        this.platillo = platillo;

        println(
            String.format("SE ESTÁ PREPARANDO EL PEDIDO: %s", platillo)
        );

        ponerPan();
        ponerMayonesa();
        ponerMostaza();
        ponerCarne();
        ponerQueso();
        ponerVegetales();
        ponerCatsup();
        ponerPan();
    }

    public void ponerPan() {
        println("COLOCANDO EL PAN: %s");
    }

    public void ponerMayonesa() {
        println("UNTANDO LA MAYONESA: %s");
    }

    public void ponerMostaza() {
        println("UNTANDO LA MOSTAZA: %s");
    }

    public void ponerCarne() {
        println("PONIENDOLE LA CARNE");

        if (this.platillo.esVegetariano()) {
            print(" DE SOYA");
        }
    }

    public void ponerQueso() {
        if (this.platillo.tieneQueso()) {
            println("PONIENDOLE EL QUESO");
        }
    }

    public void ponerVegetales() {
        println("PONIENDOLE LOS VEGETALES");
    }

    public void ponerCatsup() {
        println("PONIENDOLE CATSUP");
    }

    public Platillo getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }
    
}
