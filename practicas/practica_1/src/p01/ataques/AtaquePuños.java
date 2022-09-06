package p01.ataques;

import p01.interfaces.ComportamientoAtaque;

/**
 * Implementacion de un ataque
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class AtaquePuños extends Ataque implements ComportamientoAtaque {
    
    public AtaquePuños() {
        this.eventoAtaque = "sus puños";
    }
}
