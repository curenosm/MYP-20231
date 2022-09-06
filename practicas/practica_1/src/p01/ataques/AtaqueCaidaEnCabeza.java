package p01.ataques;

import p01.interfaces.ComportamientoAtaque;


/**
 * Implementacion de un ataque
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class AtaqueCaidaEnCabeza extends Ataque implements ComportamientoAtaque {

    public AtaqueCaidaEnCabeza() {
        this.eventoAtaque = "caida en la cabeza";
    }
}
