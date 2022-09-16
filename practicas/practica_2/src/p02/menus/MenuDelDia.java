package p02.menus;

import java.util.ArrayList;
import java.util.Collection;

import p02.modelos.Platillo;

public class MenuDelDia implements Menu {
    
    private Collection<Platillo> platillos;

    public MenuDelDia() {
        this.platillos = new ArrayList<>();
    }

    public MenuDelDia(Collection<Platillo> platillosDelMenu) {
        this.platillos = new ArrayList<>();

        platillosDelMenu.stream().forEach(p -> platillos.add(p));
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
