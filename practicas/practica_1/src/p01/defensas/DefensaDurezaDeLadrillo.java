package p01.defensas;

import p01.interfaces.ComportamientoDefensa;

/**
 * Implementacion de una defensa
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class DefensaDurezaDeLadrillo extends Defensa implements ComportamientoDefensa {
    
    public DefensaDurezaDeLadrillo(String eventoDefensa, Integer puntosDefensa) {
        super(eventoDefensa, puntosDefensa);
    }
}
