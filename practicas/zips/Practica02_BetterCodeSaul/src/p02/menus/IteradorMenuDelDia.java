package p02.menus;

import java.util.ArrayList;
import java.util.Iterator;
import p02.modelos.Platillo;

/**
 * Clase que extiende de Iterator y representa un iterador para el menu del dia
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class IteradorMenuDelDia implements Iterator<Platillo> {
    
    private ArrayList<Platillo> platillos;
    private int curIndex = 0;

    /**
     * Metodo constructor de la clase con parametros
     * @param platillos ArrayList con instancias de la clase Platillo
     */
    public IteradorMenuDelDia(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
    }

    /**
     * Metodo para saber si existe un elemento mas por iterar
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        return curIndex <= platillos.size() - 1;
    }

    /**
     * Metodo que regresa al siguiente elemento iterable
     * @return Platillo
     */
    @Override
    public Platillo next() {
        Platillo siguiente = null;

        if (hasNext()) {
            siguiente = platillos.get(curIndex++);
        }

        return siguiente;
    }

    /**
     * Metodo para regresar al iterador al inicio del ArrayList al que apunta
     */
    @Override
    public void remove() {
        curIndex = 0;
    }
    
}
