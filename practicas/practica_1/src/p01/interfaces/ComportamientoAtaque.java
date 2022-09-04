package p01.interfaces;

import p01.Personaje;

/**
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 * Interfaz que representa un comportamiento para atacar a una instancia de la clase Personaje
 */
public interface ComportamientoAtaque {
    void atacar(Personaje enemigo);
}
