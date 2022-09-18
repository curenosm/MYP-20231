package p02.menus;

import java.util.Collection;
import java.util.Iterator;

import p02.modelos.Platillo;

public class MenuGeneral extends Menu {
    
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
    public String toString() {
        String res = "MENU GENERAL\n\n";
        Iterator<Platillo> it = createIterator();
        
        while (it.hasNext()) {
            res += it.next().toString();
        }

        return res;
    }

    @Override
    public Iterator<Platillo> createIterator() {
        return new IteradorMenuGeneral(platillos);
    }
}
