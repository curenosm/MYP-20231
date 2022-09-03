package p01.util;

import java.util.List;

import p01.Franquicia;
import p01.Personaje;
import p01.Transformacion;

public final class Constantes {
    
    public static List<Transformacion> TRANSFORMACIONES_CHINPOKOMON = List.of(
        new Transformacion(
            "Charizardo",
            35, 
            15,
            "ataco usando bola de fuego",
            "se defendio usando alas escudo"
        ),
        new Transformacion(
            "Chikorisa",
            40, 
            5,
            "ataco usando latigo cepa",
            "se defendio usando hojas inutiles"
        ),
        new Transformacion(
            "Spritle",
            20, 
            25,
            "ataco usando pistola de agua",
            "se defendio usando caparazon de acero"
        )
    );

    public static List<Transformacion> TRANSFORMACIONES_COPCAM = List.of(
        new Transformacion(
            "Fire Soul",
            35, 
            7,
            "ataco usando lanzallamas",
            "se defendio usando calentar armadura"
        ),
        new Transformacion(
            "Ice Pegasus",
            35, 
            25,
            "ataco usando rayo congelador",
            "se defendio usando barrera de hielo"
        ),
        new Transformacion(
            "Wind Soul",
            35, 
            10,
            "ataco usando torbellino",
            "se defendio usando barrera de viento"
        )
    );

    public static List<Transformacion> TRANSFORMACIONES_NIENTIENDO = List.of(
        new Transformacion(
            "Hyperlink",
            33, 
            15,
            "ataco usando su espada",
            "se defendio usando giro veloz"
        ),
        new Transformacion(
            "Ladrillo",
            20, 
            45,
            "ataco cayendole en la cabeza",
            "se defendio conviertiendose en ladrillo"
        ),
        new Transformacion(
            "Don Kingkon",
            20, 
            10,
            "ataco usando sus puños",
            "se defendio cubriendose"
        )
    );

    public static List<Franquicia> FRANQUICIAS = List.of(
        new Franquicia(
            "Nientiendo",
            Constantes.TRANSFORMACIONES_NIENTIENDO
        ),
        new Franquicia(
            "Copcam", 
            Constantes.TRANSFORMACIONES_COPCAM
        ),
        new Franquicia(
            "Chinpokomon",
            Constantes.TRANSFORMACIONES_CHINPOKOMON
        )
    );

    public static Integer PUNTOS_ATAQUE_BASE = 20;
    public static Integer PUNTOS_DEFENSA_BASE = 5;

    public static List<Personaje> PERSONAJES = List.of(
        new Personaje(FRANQUICIAS.get(0), "Korby", PUNTOS_ATAQUE_BASE, PUNTOS_DEFENSA_BASE),
        new Personaje(FRANQUICIAS.get(0), "MeganMan", PUNTOS_ATAQUE_BASE, PUNTOS_ATAQUE_BASE),
        new Personaje(FRANQUICIAS.get(0), "Dittuu", PUNTOS_ATAQUE_BASE, PUNTOS_DEFENSA_BASE)
    );

    public static void println(String line) {
        System.out.println(line);
    }
}
