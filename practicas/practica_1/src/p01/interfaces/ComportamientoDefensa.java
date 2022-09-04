package p01.interfaces;

/**
 * Interfaz que representa un comportamiento para defenderse de una x cantidad de puntos de ataque.
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public interface ComportamientoDefensa {
    Integer defender(Integer puntosDelAtaque);
    String evento();
}
