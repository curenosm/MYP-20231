package p02.menus;

import java.util.Hashtable;
import java.util.Iterator;

import p02.modelos.Platillo;

public class IteradorMenuEspecial implements Iterator<Platillo> {

    private Hashtable<Long, Platillo> platillos;
    private Iterator<Platillo> it;

    public IteradorMenuEspecial(Hashtable<Long, Platillo> platillos) {
        this.platillos = platillos;
        it = platillos.elements().asIterator();
    }
    
    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public Platillo next() {
        return it.next();
    }

    @Override
    public void remove() {
        it.remove();
    }

}
