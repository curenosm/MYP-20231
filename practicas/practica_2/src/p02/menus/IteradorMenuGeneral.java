package p02.menus;

import java.util.Iterator;

import p02.modelos.Platillo;

/**
 * Clase que representa el iterador de un menu general, es decir, iterador de un arreglo
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class IteradorMenuGeneral implements Iterator<Platillo> {

    private Platillo[] platillos;
    private int curIndex = 0;
    
    /**
     * Metodo constructor con parametros de la clase
     * @param platillos Arreglo con instancias de la clase Platillo
     */
    public IteradorMenuGeneral(Platillo[] platillos) {
        this.platillos = platillos;
    }

    /**
     * Metodo para saber si exise un elemento mas en el arreglo que se pueda iterar
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        return 0 <= curIndex && curIndex != platillos.length;
    }

    /**
     * Metodo que regresa el siguiente elemento del arreglo
     * @return Platillo
     */
    @Override
    public Platillo next() {
        Platillo siguiente = null;

        if (hasNext()) {
            siguiente = platillos[curIndex++];
        }

        return siguiente;
    }

    /**
     * Metodo para regresar el iterador al inicio del arreglo
     */
    @Override
    public void remove() {
        curIndex = 0;
    }

}
