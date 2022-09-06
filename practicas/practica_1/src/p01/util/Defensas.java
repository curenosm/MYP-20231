package p01.util;

import p01.defensas.DefensaAlasEscudo;
import p01.defensas.DefensaBarreraDeHielo;
import p01.defensas.DefensaBarreraDeViento;
import p01.defensas.DefensaCalentarArmadura;
import p01.defensas.DefensaCaparazonDeAcero;
import p01.defensas.DefensaCubrirse;
import p01.defensas.DefensaDurezaDeLadrillo;
import p01.defensas.DefensaGiroVeloz;
import p01.defensas.DefensaHojasInutiles;
import p01.interfaces.ComportamientoDefensa;

public class Defensas {

    public static ComportamientoDefensa defensaAlasEscudo = new DefensaAlasEscudo(
        "alas escudo",
        3
    );

    public static ComportamientoDefensa defensaHojasInutiles = new DefensaHojasInutiles(
        "hojas inutiles",
        1
    );

    public static ComportamientoDefensa defensaCaparazonDeAcero = new DefensaCaparazonDeAcero(
        "caparazon de acero",
        15
    );

    public static ComportamientoDefensa defensaCalentarArmadura = new DefensaCalentarArmadura(
        "calentar armadura",
        7
    );

    public static ComportamientoDefensa defensaBarreraDeHielo = new DefensaBarreraDeHielo(
        "barrera de hielo",
        10
    );

    public static ComportamientoDefensa defensaBarreraDeViento = new DefensaBarreraDeViento(
        "barrera de viento",
        5
    );

    public static ComportamientoDefensa defensaDurezaDeLadrillo = new DefensaDurezaDeLadrillo(
        "dureza de ladrillo",
        10
    );

    public static ComportamientoDefensa defensaGiroVeloz = new DefensaGiroVeloz(
        "giro veloz",
        7
    );

    public static ComportamientoDefensa defensaCubrirse = new DefensaCubrirse(
        "cubrirse",
        5
    );
    
}
