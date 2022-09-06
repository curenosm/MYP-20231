package p01.defensas;

/**
 * Clase que representa una defensa asociada a una transformación
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
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
        // Acción extra para personalizar mas el evento efectuado
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
