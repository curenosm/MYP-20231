package p02.menus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import p02.modelos.Platillo;

public class MenuDelDia extends Menu {
    
    private ArrayList<Platillo> platillos;

    public MenuDelDia() {
        this.platillos = new ArrayList<>();
    }

    public MenuDelDia(Collection<Platillo> platillosDelMenu) {
        this.platillos = new ArrayList<>();

        platillosDelMenu.stream().forEach(p -> platillos.add(p));
    }

    @Override
    public Iterator<Platillo> createIterator() {
        return new IteradorMenuDelDia(platillos);
    }

    
}
