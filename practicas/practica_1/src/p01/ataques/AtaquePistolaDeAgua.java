package p01.ataques;

import p01.Personaje;
import p01.interfaces.ComportamientoAtaque;

public class AtaquePistolaDeAgua extends Ataque implements ComportamientoAtaque {

    public AtaquePistolaDeAgua() {
        this.eventoAtaque = "bola de fuego";
    }

}
