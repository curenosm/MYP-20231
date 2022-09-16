package p02.menus;

import java.util.Collection;

import p02.modelos.Platillo;

public class MenuGeneral implements Menu {
    
    private Platillo[] platillos;

    public MenuGeneral(Collection<Platillo> platillosDelMenu) {
        this.platillos = new Platillo[platillosDelMenu.size()];

        int i = 0;
        for (Platillo p: platillosDelMenu) {
            platillos[i++] = p;
        }
    }

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
