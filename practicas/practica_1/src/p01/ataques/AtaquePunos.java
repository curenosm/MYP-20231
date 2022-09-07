package p01.ataques;

import p01.interfaces.ComportamientoAtaque;

/**
 * Implementacion de un ataque
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class AtaquePunos extends Ataque implements ComportamientoAtaque {
    
    public AtaquePunos(String eventoAtaque, Integer puntosAtaque) {
        super(eventoAtaque, puntosAtaque);
    }

}
