package p02.menus;

import java.util.Iterator;

import p02.modelos.Platillo;;

/**
 * Clase abstracta que representa un menu
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public abstract class Menu {
    
    public abstract Iterator<Platillo> createIterator();

    /**
     * Metodo que representa en cadena a la clase
     * @return String
     */
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

    public Platillo buscarPlatillo(Long id) {
        Iterator<Platillo> it = createIterator();

        while(it.hasNext()) {
            Platillo cur = it.next();

            if (cur.getId().equals(id)) {
                return cur;
            }
        }

        return null;
    }
}
