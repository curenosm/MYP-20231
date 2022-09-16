package p02.menus;

import java.util.Hashtable;

import p02.modelos.Platillo;

public class MenuEspecial implements Menu {
    
    private Hashtable platillos;

    public MenuEspecial() {
        platillos = new Hashtable<Long, Platillo>();
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
