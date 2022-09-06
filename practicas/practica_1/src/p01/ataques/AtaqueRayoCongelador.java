package p01.ataques;

import p01.interfaces.ComportamientoAtaque;


/**
 * Implementacion de un ataque
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class AtaqueRayoCongelador extends Ataque implements ComportamientoAtaque  {
    
    public AtaqueRayoCongelador() {
        this.eventoAtaque = "rayo congelador";
    }
}
