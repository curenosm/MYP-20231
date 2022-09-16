package p02.menus;

import p02.modelos.Platillo;

public class MenuGeneral implements Menu {
    
    private Platillo[] platillos;

    public MenuGeneral() {
        platillos = new Platillo[10];
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
