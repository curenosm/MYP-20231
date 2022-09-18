package p02.menus;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import p02.modelos.Platillo;

public class MenuEspecial implements Menu {
    
    private Hashtable<Long, Platillo> platillos;
    private Iterator<Long> it;

    public MenuEspecial() {
        platillos = new Hashtable<Long, Platillo>();
        it = platillos.keys().asIterator();
    }

    public MenuEspecial(Collection<Platillo> platillosDelMenu) {
        this.platillos = new Hashtable<Long, Platillo>();
        it = platillos.keys().asIterator();

        System.out.println(it.hasNext());

        platillosDelMenu.stream().forEach(
            p -> platillos.put(System.currentTimeMillis(), p)
        );
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public Platillo next() {
        Platillo siguiente = null;

        if (hasNext()) {
            siguiente = platillos.get(it.next());
        } else {
            it.remove();
        }

        return siguiente;

    }

    @Override
    public String toString() {
        String res = "MENU ESPECIAL\n\n";
        
        System.out.println(this.platillos.toString());

        while (hasNext()) {
            res += next().toString();
        }

        return res + "\n";

    }
}
