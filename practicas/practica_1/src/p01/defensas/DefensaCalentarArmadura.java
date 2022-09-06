package p01.defensas;

import p01.interfaces.ComportamientoDefensa;

/**
 * Implementacion de una defensa
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */

public class DefensaCalentarArmadura extends Defensa implements ComportamientoDefensa {
    
    public DefensaCalentarArmadura() {
        this.eventoDefensa = "calentar armadura";
    }
}
