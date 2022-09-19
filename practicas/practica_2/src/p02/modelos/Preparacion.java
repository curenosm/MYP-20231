package p02.modelos;

import static p02.util.Printer.println;
import static p02.util.Printer.print;

/**
 * Clase abstracta que representa la preparacion de un platillo
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public abstract class Preparacion {

    private Platillo platillo;

    /**
     * Metodo que realiza la preparacion de un platillo y los muestra en pantalla al usuario
     * @param platillo
     */
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

    /**
     * Metodo que imprime en pantalla el paso de poner pan
     */
    public void ponerPan() {
        println("COLOCANDO EL PAN: %s");
    }

    /**
     * Metodo que imprime en pantalla el paso de poner mayones
     */
    public void ponerMayonesa() {
        println("UNTANDO LA MAYONESA: %s");
    }

    /**
     * Metodo que imprime en pantalla el paso de poner mostaza
     */
    public void ponerMostaza() {
        println("UNTANDO LA MOSTAZA: %s");
    }

    /**
     * Metodo que imprime en pantalla el paso de poner carne, el tipo de carne dependera de si el platillo es vegetariano
     */
    public void ponerCarne() {
        println("PONIENDOLE LA CARNE");

        if (this.platillo.esVegetariano()) {
            print(" DE SOYA");
        }
    }

    /**
     * Metodo que imprime en pantalla el paso de poner queso, esto puede ocurrir o no segun el platillo
     */
    public void ponerQueso() {
        if (this.platillo.tieneQueso()) {
            println("PONIENDOLE EL QUESO");
        }
    }

    /**
     * Metodo que imprime en pantalla el paso de poner vegetales
     */
    public void ponerVegetales() {
        println("PONIENDOLE LOS VEGETALES");
    }

    /**
     * Metodo que imprime en pantalla el paso de poner catsup
     */
    public void ponerCatsup() {
        println("PONIENDOLE CATSUP");
    }

    /**
     * Metodo para obtener el platillo que se va a preparar
     * @return Platillo
     */
    public Platillo getPlatillo() {
        return platillo;
    }

    /**
     * Metodo para modificar el valor del platillo que se va preparar
     * @param platillo Instancia de la clase Ṕlatillo a preparar
     */
    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }
    
}
