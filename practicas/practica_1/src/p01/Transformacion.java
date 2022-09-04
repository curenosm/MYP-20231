package p01;

import p01.interfaces.ComportamientoAtaque;
import p01.interfaces.ComportamientoDefensa;

/**
 * Clase que genera la transformacion de un personaje
 * @author Alcantara Estrada Kevin
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Transformacion {
    
    public String nombre;
    public Integer puntosAtaque;
    public Integer puntosDefensa;
    public ComportamientoAtaque comportamientoAtaque;
    public ComportamientoDefensa comportamientoDefensa;

    /**
     * Metodo constructor de la clase.
     * 
     * @param nombre nombre de la transofrmacion del personaje
     * @param puntosAtaque puntos de ataque del personaje
     * @param puntosDefensa puntos de defensa del personaje
     * @param comportamientoAtaque forma de ataque del personaje
     * @param comportamientoDefensa forma de ataque del personaje
    */
    public Transformacion(String nombre,
                            Integer puntosAtaque,
                            Integer puntosDefensa,
                            ComportamientoAtaque comportamientoAtaque,
                            ComportamientoDefensa comportamientoDefensa) {
        this.nombre = nombre;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.comportamientoAtaque = comportamientoAtaque;
        this.comportamientoDefensa = comportamientoDefensa;
    }

    /**
     * Metodo de representacion en cadena del objeto.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return this.nombre;
    }
}
