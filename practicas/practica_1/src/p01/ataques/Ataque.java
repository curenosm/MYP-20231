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
    
    /**
     * Constructor sin parametros de la clase
     */
    public Ataque() {
        this.eventoAtaque = "";
        this.puntosAtaque = 0;
    }

    /**
     * Constructor con parametros de la clase
     * @param eventoAtaque La forma en que ataca
     * @param puntosAtaque El danio que produce el ataque
     */
    public Ataque(String eventoAtaque, Integer puntosAtaque) {
        this.eventoAtaque = eventoAtaque;
        this.puntosAtaque = puntosAtaque;
    }

    /**
     * Metodo para atacar a un personaja enemigos
     * @param enemigo instancia de la clase Personaje
     */
    public void atacar(Personaje enemigo) {
        // Acción extra para personalizar más el evento efectuado por el ataque
    }

    /**
     * Metodo para describir el ataque
     * @return String
     */
    public String evento() {
        return this.eventoAtaque;
    }

    /**
     * Representacion en cadena de la clase
     * @return String
     */
    @Override
    public String toString() {
        return evento();
    }

}
