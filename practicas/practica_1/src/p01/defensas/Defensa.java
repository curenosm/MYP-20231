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
    
    /**
     * Metodo constructor sin parametros de la clase
     */
    public Defensa() {
        this.eventoDefensa = "";
        this.puntosDefensa = 0;
    }

    /**
     * Metodo constructor con parametros de la clase
     * @param eventoDefensa Describe como es la forma de defenderse
     * @param puntosDefensa Puntos de danio que evita al defenderse
     */
    public Defensa(String eventoDefensa, Integer puntosDefensa) {
        this.eventoDefensa = eventoDefensa;
        this.puntosDefensa = puntosDefensa;
    }

    /**
     * Metodo para defenderse de un ataque enemigo
     * @param puntosDelAtaque Danio que produce el ataque enemigo
     * @return Integer
     */
    public Integer defender(Integer puntosDelAtaque) {
        // Acción extra para personalizar mas el evento efectuado
        return puntosDelAtaque;
    }

    /**
     * Metodo que devuelve la forma en que se realiza la defensa
     * @return String
     */
    public String evento() {
        return this.eventoDefensa;
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
