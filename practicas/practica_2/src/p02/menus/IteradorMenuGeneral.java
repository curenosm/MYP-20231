package p02.menus;

import java.util.Iterator;

import p02.modelos.Platillo;

public class IteradorMenuGeneral implements Iterator<Platillo> {

    private Platillo[] platillos;
    private int curIndex = 0;
    
    public IteradorMenuGeneral(Platillo[] platillos) {
        this.platillos = platillos;
    }

    @Override
    public boolean hasNext() {
        return 0 <= curIndex && curIndex != platillos.length;
    }

    @Override
    public Platillo next() {
        Platillo siguiente = null;

        if (hasNext()) {
            siguiente = platillos[curIndex++];
        }

        return siguiente;
    }

    @Override
    public void remove() {
        curIndex = 0;
    }

}
