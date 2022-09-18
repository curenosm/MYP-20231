package p02.menus;

import java.util.Iterator;

import p02.modelos.Platillo;;

public abstract class Menu {
    
    public abstract Iterator<Platillo> createIterator();

    @Override
    public String toString() {
        String res = "MENU DEL DIA\n\n";
        Iterator<Platillo> it = createIterator();

        while (it.hasNext()) {
            res += it.next().toString();
        }

        it.remove();

        return res + "\n";
    }
}
