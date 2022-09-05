package p01.defensas;

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

    @Override
    public String toString() {
        return evento();
    }
}
