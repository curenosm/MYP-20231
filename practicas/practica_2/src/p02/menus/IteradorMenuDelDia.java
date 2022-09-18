package p02.menus;

import java.util.ArrayList;
import java.util.Iterator;
import p02.modelos.Platillo;

public class IteradorMenuDelDia implements Iterator<Platillo> {
    
    private ArrayList<Platillo> platillos;
    private int curIndex = 0;

    public IteradorMenuDelDia(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
    }

    @Override
    public boolean hasNext() {
        return curIndex <= platillos.size() - 1;
    }

    @Override
    public Platillo next() {
        Platillo siguiente = null;

        if (hasNext()) {
            siguiente = platillos.get(curIndex++);
        }

        return siguiente;
    }

    @Override
    public void remove() {
        curIndex = 0;
    }
    
}
