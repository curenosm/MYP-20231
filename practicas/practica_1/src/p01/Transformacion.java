package p01;

/**
 * @author Alcantara Estrada Kevin
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 * Clase que genera la transformacion de un personaje
 */
public class Transformacion {
    public String nombre;
    public Integer puntosAtaque;
    public Integer puntosDefensa;
    public String eventoAtaque;
    public String eventoDefensa;

/**
 * Metodo constructor de la clase
 * @param nombre nombre de la transofrmacion del personaje
 * @param puntosAtaque puntos de ataque del personaje
 * @param puntosDefensa puntos de defensa del personaje
 * @param eventoAtaque forma de ataque del personaje
 * @param eventoDefensa forma de ataque del personaje
 */
    public Transformacion(String nombre,
                            Integer puntosAtaque,
                            Integer puntosDefensa,
                            String eventoAtaque,
                            String eventoDefensa) {
        this.nombre = nombre;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.eventoAtaque = eventoAtaque;
        this.eventoDefensa = eventoDefensa;
    }

    @Override
    /**
     * Metodo de representacion en cadena del objeto
     * @return String
     */
    public String toString() {
        return this.nombre;
    }
}
