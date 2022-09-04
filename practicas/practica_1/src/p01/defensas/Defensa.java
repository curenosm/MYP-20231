package p01.defensas;

import p01.Personaje;

public class Defensa {

    public String eventoDefensa;
    public Integer puntosDefensa;
    
    public Defensa() {
        this.eventoDefensa = "";
        this.puntosDefensa = 0;
    }

    public Defensa(String eventoDefensa, Integer puntosDefensa) {
        this.eventoDefensa = eventoDefensa;
        this.puntosDefensa = puntosDefensa;
    }

    public Integer defender(Integer puntosDelAtaque) {
        return puntosDelAtaque;
    }

    public String evento() {
        return this.eventoDefensa;
    }
}
