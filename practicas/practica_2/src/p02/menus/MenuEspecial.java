package p02.menus;

import java.util.Collection;
import java.util.Hashtable;

import p02.modelos.Platillo;

public class MenuEspecial implements Menu {
    
    private Hashtable<Long, Platillo> platillos;

    public MenuEspecial() {
        platillos = new Hashtable<Long, Platillo>();
    }

    public MenuEspecial(Collection<Platillo> platillosDelMenu) {
        this.platillos = new Hashtable<Long, Platillo>();

        platillosDelMenu.stream().forEach(
            p -> platillos.put(System.currentTimeMillis(), p)
        );
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Platillo next() {
        // TODO Auto-generated method stub
        return null;
    }
}
