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
    public static ComportamientoAtaque ataqueBolaDeFuego = new AtaqueBolaDeFuego();
    public static ComportamientoAtaque ataqueLatigoCepa = new AtaqueLatigoCepa();
    public static ComportamientoAtaque ataquePistolaDeAgua = new AtaquePistolaDeAgua();
    public static ComportamientoAtaque ataqueLanzallamas = new AtaqueLanzallamas();
    public static ComportamientoAtaque ataqueRayoCongelador = new AtaqueRayoCongelador();
    public static ComportamientoAtaque ataqueTorbellino = new AtaqueTorbellino();
    public static ComportamientoAtaque ataqueEspada = new AtaqueEspada();
    public static ComportamientoAtaque ataqueCaidaEnCabeza = new AtaqueCaidaEnCabeza();
    public static ComportamientoAtaque ataquePuños = new AtaquePuños();
}
