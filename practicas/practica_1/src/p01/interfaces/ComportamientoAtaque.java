package p01.interfaces;

import p01.Personaje;

/**
 *  Interfaz que representa un comportamiento para atacar a una instancia de la clase Personaje
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public interface ComportamientoAtaque {
    void atacar(Personaje enemigo);
    String evento();
}
