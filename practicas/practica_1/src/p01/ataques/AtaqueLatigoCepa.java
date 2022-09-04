package p01.ataques;

import p01.Personaje;
import p01.interfaces.ComportamientoAtaque;

public class AtaqueLatigoCepa extends Ataque implements ComportamientoAtaque {

    public AtaqueLatigoCepa() {
        this.eventoAtaque = "latigo cepa";
    }
    
}
