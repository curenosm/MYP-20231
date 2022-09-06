package p01.util;

import p01.ataques.AtaqueBolaDeFuego;
import p01.ataques.AtaqueCaidaEnCabeza;
import p01.ataques.AtaqueEspada;
import p01.ataques.AtaqueLanzallamas;
import p01.ataques.AtaqueLatigoCepa;
import p01.ataques.AtaquePistolaDeAgua;
import p01.ataques.AtaquePuños;
import p01.ataques.AtaqueRayoCongelador;
import p01.ataques.AtaqueTorbellino;
import p01.interfaces.ComportamientoAtaque;

public class Ataques {

    // Chinpokomon
    public static ComportamientoAtaque ataqueBolaDeFuego = new AtaqueBolaDeFuego(
        "bola de fuego", 
        35
    );

    public static ComportamientoAtaque ataqueLatigoCepa = new AtaqueLatigoCepa(
        "latigo cepa",
        40
    );

    public static ComportamientoAtaque ataquePistolaDeAgua = new AtaquePistolaDeAgua(
        "pistola de agua",
        20
    );

    // Copcam
    public static ComportamientoAtaque ataqueLanzallamas = new AtaqueLanzallamas(
        "lanzallamas",
        35
    );

    public static ComportamientoAtaque ataqueRayoCongelador = new AtaqueRayoCongelador(
        "rayo congelador",
        35
    );

    public static ComportamientoAtaque ataqueTorbellino = new AtaqueTorbellino(
        "torbellino",
        35
    );

    // Nientiendo
    public static ComportamientoAtaque ataqueEspada = new AtaqueEspada(
        "su espada",
        33
    );

    public static ComportamientoAtaque ataqueCaidaEnCabeza = new AtaqueCaidaEnCabeza(
        "caida en la cabeza",
        20
    );

    public static ComportamientoAtaque ataquePuños = new AtaquePuños(
        "sus puños",
        20
    );
}
