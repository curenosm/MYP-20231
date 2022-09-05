package p01.ataques;

import p01.modelos.Personaje;

/**
 * Clase que representa un ataque asociado a una transformación
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
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
