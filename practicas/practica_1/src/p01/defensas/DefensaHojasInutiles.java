package p01.defensas;

import p01.interfaces.ComportamientoDefensa;

/**
 * Implementacion de una defensa
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class DefensaHojasInutiles extends Defensa implements ComportamientoDefensa {
    
    public DefensaHojasInutiles(String eventoDefensa, Integer puntosDefensa) {
        super(eventoDefensa, puntosDefensa);
    }
}
