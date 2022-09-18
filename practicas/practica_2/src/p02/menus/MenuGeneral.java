package p02.menus;

import java.util.Collection;

import p02.modelos.Platillo;

public class MenuGeneral implements Menu {
    
    private Platillo[] platillos;
    private int curIndex = 0;

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
        return curIndex != platillos.length - 1;
    }

    @Override
    public Platillo next() {
        Platillo siguiente = null;

        if (hasNext()) {
            siguiente = platillos[curIndex++];
        } else {
            curIndex = 0;
        }

        return siguiente;
    }


    @Override
    public String toString() {
        String res = "MENU GENERAL\n\n";
        
        for (Platillo p: platillos) {
            res += p.toString();
        }

        return res;

    }
}
