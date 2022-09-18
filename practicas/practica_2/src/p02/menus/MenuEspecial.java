package p02.menus;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import p02.modelos.Platillo;

/**
 * Clase que extiende de la clase Menu, representa al menu especial
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class MenuEspecial extends Menu {
    
    private Hashtable<Long, Platillo> platillos;

    /**
     * Metodo constructor sin parametros de la clase
     */
    public MenuEspecial() {
        platillos = new Hashtable<Long, Platillo>();
    }

    /**
     * Metodo constructor con parametros de la clase
     * @param platillosDelMenu Coleccion con instancias de la clase Platillo
     */
    public MenuEspecial(Collection<Platillo> platillosDelMenu) {
        this.platillos = new Hashtable<Long, Platillo>();

        platillosDelMenu.stream().forEach(
            p -> platillos.put(p.getId(), p)
        );
    }

    /**
     * Representacion en cadena de la clase
     * @return String
     */
    @Override
    public String toString() {
        String res = "MENU ESPECIAL\n\n";
        Iterator<Platillo> it = createIterator();

        while (it.hasNext()) {
            res += it.next().toString();
        }
        
        return res + "\n";
    }

    /**
     * Metodo que regresa un iterador para recorrer el menu
     * @return Iterator<Platillo>
     */
    @Override
    public Iterator<Platillo> createIterator() {
        return new IteradorMenuEspecial(platillos);
    }
}
