package p02.menus;

import java.util.ArrayList;
import java.util.Collection;

import p02.modelos.Platillo;

public class MenuDelDia implements Menu {
    
    private ArrayList<Platillo> platillos;
    private Integer curIndex;

    public MenuDelDia() {
        this.platillos = new ArrayList<>();
        this.curIndex = 0;
    }

    public MenuDelDia(Collection<Platillo> platillosDelMenu) {
        this.platillos = new ArrayList<>();
        this.curIndex = 0;

        platillosDelMenu.stream().forEach(p -> platillos.add(p));
    }

    @Override
    public boolean hasNext() {
        return curIndex < platillos.size() - 1;
    }

    @Override
    public Platillo next() {
        Platillo siguiente = null;

        if (hasNext()) {
            siguiente = platillos.get(curIndex++);
        } else {
            curIndex = 0;
        }

        return siguiente;
    }

    @Override
    public String toString() {
        String res = "MENU DEL DIA\n\n";

        for (Platillo p : platillos) {
            res += p.toString();
        }

        return res + "\n";
    }
}
