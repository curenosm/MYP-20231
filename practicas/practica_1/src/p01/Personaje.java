package p01;
import p01.interfaces.ComportamientoDefensa;
import p01.util.Constantes;
import p01.interfaces.ComportamientoAtaque;
import p01.ataques.Ataque;
import p01.defensas.Defensa;

import static p01.util.Constantes.println;

/**
 * @author Alcantara Estrada Kevin
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 * Clase que simula un personaje del torneo de pelea
 */
public class Personaje {

    public Franquicia franquicia;
    public Integer puntosDeVida;
    public Transformacion powerUpActual;
    public String nombre;
    public Integer puntosAtaqueBase;
    public Integer puntosDefensaBase;

    /**
     * Metodo constructor de la clase
     * @param franquicia Franquicia de la cual proviene el personaje
     * @param nombre Nombre del personaje
     * @param puntosAtaqueBase Puntos de ataque originales 
     * @param puntosDefensaBase Puntos de defensa originales
     */
    public Personaje(Franquicia franquicia, 
                        String nombre,
                        Integer puntosAtaqueBase,
                        Integer puntosDefensaBase) {
        this.franquicia = franquicia;
        this.puntosDeVida = Constantes.PUNTOS_DE_VIDA_INICIALES;
        this.powerUpActual = null;
        this.nombre = nombre;
        this.puntosAtaqueBase = puntosAtaqueBase;
        this.puntosDefensaBase = puntosDefensaBase;
    }

    /**
     * Metodo para atacar a un enemigo y afectar sus puntos de vida
     * @param enemigo Instancia de la clase Personaje a la cual se esta atacando
     */
    public void atacar(Personaje enemigo) {

        // Agrega un comportamiento extra dependiendo de cada comportamiento
        if (this.powerUpActual != null) {
            this.powerUpActual.comportamientoAtaque.atacar(enemigo);
        }

        int puntosAtaque = this.obtenerPuntosAtaque();

        enemigo.puntosDeVida -= enemigo.defender(puntosAtaque);
    }

    /**
     * Metodo para obtener el valor de los puntos de ataque del personaje
     * @return Integer
     */
    public Integer obtenerPuntosAtaque() {
        if (this.powerUpActual != null) {
            return this.puntosAtaqueBase + ((Ataque) this.powerUpActual.comportamientoAtaque).puntosAtaque;
        }
        
        return this.puntosAtaqueBase;
    }

    /**
     * Metodo para obtener el valor de los puntos de defensa del personaje
     * @return Integer
     */
    public Integer obtenerPuntosDefensa() {
        if (this.powerUpActual != null) {
            return this.puntosAtaqueBase + ((Defensa) this.powerUpActual.comportamientoDefensa).puntosDefensa;
        }
        
        return this.puntosDefensaBase;
    }

    /**
     * Metodo para defenderse del atatque de otro personaje y reducir el danio 
     * @param puntosDelAtaque Valor del ataque que se esta recibiendo
     * @return Integer
     */
    public Integer defender(Integer puntosDelAtaque) {

        // Agrega un comportamiento extra dependiendo de cada comportamiento
        if (this.powerUpActual != null) {
            this.powerUpActual.comportamientoDefensa.defender(puntosDelAtaque);
        }

        return puntosDelAtaque -= this.obtenerPuntosDefensa();
    }

    @Override
    /**
     * Representacion en cadena del objeto
     * @return String
     */
    public String toString() {
        return this.nombre;
    }

    /**
     * Metodo para saber si el personaje aun cuenta con puntos de vida
     * @return boolean
     */
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    /**
     * Metodo que explica en una cadena de texto el ataque utilizado por el personaje
     * @return String
     */
    public String eventoAtaque() {
        return powerUpActual != null 
            ? "usando " + powerUpActual.comportamientoAtaque.evento() 
            : "";
    }

    /**
     * Metodo que explica en una cadena de texto la defensa utilizada por el personaje
     * @return String
     */
    public String eventoDefensa() {
        return powerUpActual != null 
            ? "usando " + powerUpActual.comportamientoDefensa.evento() 
            : "";
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof Personaje ) {
            if (((Personaje) obj).nombre != null) {
                return ((Personaje) obj).nombre.equals(this.nombre);
            }
            
            return false;
        }

        return false;
    }
}
