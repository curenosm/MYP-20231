package p02.menus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import p02.modelos.Platillo;

/**
 * Clase que extiende de la clase Menu y representa al menu del dia
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class MenuDelDia extends Menu {
    
    private ArrayList<Platillo> platillos;

    /**
     * Metodo constructor sin parametros de la clase
     */
    public MenuDelDia() {
        this.platillos = new ArrayList<>();
    }

    /**
     * Metodo constructor con parametros de la clase
     * @param platillosDelMenu Coleccion de instancias de la clase Platillo
     */
    public MenuDelDia(Collection<Platillo> platillosDelMenu) {
        this.platillos = new ArrayList<>();

        platillosDelMenu.stream().forEach(p -> platillos.add(p));
    }

    /**
     * Metodo que devuelve un iterador para el menu del dia
     * @return Iterator<Platillo>
     */
    @Override
    public Iterator<Platillo> createIterator() {
        return new IteradorMenuDelDia(platillos);
    }

    
}
