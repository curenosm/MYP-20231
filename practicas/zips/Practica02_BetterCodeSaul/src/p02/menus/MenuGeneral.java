package p02.menus;

import java.util.Collection;
import java.util.Iterator;

import p02.modelos.Platillo;

/**
 * Clase que extiende de Menu, representa el menu general
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class MenuGeneral extends Menu {
    
    private Platillo[] platillos;
    
    /**
     * Metodo constructor de la clase con parametros
     * @param platillosDelMenu Coleccion con instancias de la clase Platillo
     */
    public MenuGeneral(Collection<Platillo> platillosDelMenu) {
        this.platillos = new Platillo[platillosDelMenu.size()];

        int i = 0;
        for (Platillo p: platillosDelMenu) {
            platillos[i++] = p;
        }
    }

    /**
     * Metodo constructor sin parametros de la clase
     */
    public MenuGeneral() {
        platillos = new Platillo[10];
    }

    /**
     * Metodo para representar en cadena la clase
     * @return String
     */
    @Override
    public String toString() {
        String res = "MENU GENERAL\n\n";
        Iterator<Platillo> it = createIterator();
        
        while (it.hasNext()) {
            res += it.next().toString();
        }

        return res;
    }

    /**
     * Metodo que regresa un iterador para recorrer los platillos que guarda la clase
     * @return Iterator<Platillo>
     */
    @Override
    public Iterator<Platillo> createIterator() {
        return new IteradorMenuGeneral(platillos);
    }
}
