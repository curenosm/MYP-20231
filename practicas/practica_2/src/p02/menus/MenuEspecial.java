package p02.menus;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import p02.modelos.Platillo;

public class MenuEspecial extends Menu {
    
    private Hashtable<Long, Platillo> platillos;

    public MenuEspecial() {
        platillos = new Hashtable<Long, Platillo>();
    }

    public MenuEspecial(Collection<Platillo> platillosDelMenu) {
        this.platillos = new Hashtable<Long, Platillo>();

        platillosDelMenu.stream().forEach(
            p -> platillos.put(p.getId(), p)
        );
    }

    @Override
    public String toString() {
        String res = "MENU ESPECIAL\n\n";
        Iterator<Platillo> it = createIterator();

        while (it.hasNext()) {
            res += it.next().toString();
        }
        
        return res + "\n";
    }

    @Override
    public Iterator<Platillo> createIterator() {
        return new IteradorMenuEspecial(platillos);
    }
}
