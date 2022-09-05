package p01.ataques;

import p01.Personaje;

public class Ataque {
    public String eventoAtaque;
    public Integer puntosAtaque;
    
    public Ataque() {
        this.eventoAtaque = "";
        this.puntosAtaque = 0;
    }

    public Ataque(String eventoAtaque, Integer puntosAtaque) {
        this.eventoAtaque = eventoAtaque;
        this.puntosAtaque = puntosAtaque;
    }

    public void atacar(Personaje enemigo) {
        // Acción extra para personalizar más el evento efectuado por el ataque
    }

    public String evento() {
        return this.eventoAtaque;
    }

    @Override
    public String toString() {
        return evento();
    }

}
