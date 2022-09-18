package p02.menus;

import java.util.Hashtable;
import java.util.Iterator;

import p02.modelos.Platillo;

/**
 * Clase que extiende de Iterator y representa un iterador para el menu especial
 */
public class IteradorMenuEspecial implements Iterator<Platillo> {

    private Hashtable<Long, Platillo> platillos;
    private Iterator<Platillo> it;

    /**
     * Metodo constructor con parametros de la clase
     * @param platillos Hashtable con instancias de la clase Platillo
     */
    public IteradorMenuEspecial(Hashtable<Long, Platillo> platillos) {
        this.platillos = platillos;
        it = platillos.elements().asIterator();

        for (Long id : platillos.keySet()) {
            System.out.println(platillos.get(id));
        }
    }
    
    /**
     * Metodo para saber si hay o no otro elemento por iterar
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    /**
     * Metodo para regresar al siguiente elemento de la coleccion
     * @return Platillo
     */
    @Override
    public Platillo next() {
        return it.next();
    }

    /**
     * Metodo para que al iterador apunte de nuevo al inicio
     */
    @Override
    public void remove() {
        it.remove();
    }

}
