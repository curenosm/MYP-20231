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
    public static ComportamientoDefensa defensaAlasEscudo = new DefensaAlasEscudo();
    public static ComportamientoDefensa defensaHojasInutiles = new DefensaHojasInutiles();
    public static ComportamientoDefensa defensaCaparazonDeAcero = new DefensaCaparazonDeAcero();
    public static ComportamientoDefensa defensaCalentarArmadura = new DefensaCalentarArmadura();
    public static ComportamientoDefensa defensaBarreraDeHielo = new DefensaBarreraDeHielo();
    public static ComportamientoDefensa defensaBarreraDeViento = new DefensaBarreraDeViento();
    public static ComportamientoDefensa defensaDurezaDeLadrillo = new DefensaDurezaDeLadrillo();
    public static ComportamientoDefensa defensaGiroVeloz = new DefensaGiroVeloz();
    public static ComportamientoDefensa defensaCubrirse = new DefensaCubrirse();
}
