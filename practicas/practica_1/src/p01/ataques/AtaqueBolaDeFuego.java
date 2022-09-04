package p01.ataques;

import p01.Personaje;
import p01.interfaces.ComportamientoAtaque;

public class AtaqueBolaDeFuego extends Ataque implements ComportamientoAtaque {

    public AtaqueBolaDeFuego() {
        this.eventoAtaque = "bola de fuego";
    }

    @Override
    public String evento() {
        return this.eventoAtaque;
    }
    
}
