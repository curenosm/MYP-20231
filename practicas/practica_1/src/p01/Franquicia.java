package p01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 * Clase que simula una frnaquicia de la que vendran nuestros personajes
 */
public class Franquicia {
    public String nombre;
    public List<Transformacion> transformaciones; 

    /**
     * Metodo constructor de la clase sin parametros
     */
    public Franquicia() {
        this.transformaciones = new ArrayList<>();
    }

    /**
     * Metodo constructor de la clases con parametros
     * @param nombre Nombre de la franquicia
     * @param transformaciones Lista de transformaciones que posee la franquicia
     */
    public Franquicia(String nombre, List<Transformacion> transformaciones) {
        this.nombre = nombre;
        this.transformaciones = transformaciones;
    }

    /**
     * Metodo para obtener la primera transformacion de la lista de transformaciones
     * @return Transformacion
     */
    public Transformacion obtenerTransformacion() {
        return transformaciones.get(0);
    }

    @Override
    /**
     * Representacion en cadena del objeto
     * @return String
     */
    public String toString() {
        return this.nombre;
    }
}
