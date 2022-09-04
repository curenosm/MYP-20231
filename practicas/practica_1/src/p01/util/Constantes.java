package p01.util;

import java.util.List;

import p01.Franquicia;
import p01.Personaje;
import p01.Transformacion;

/**
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 * Clase con las constantes que seran utilizadas para el torneo
 */
public final class Constantes {
    
    
    public static List<Transformacion> TRANSFORMACIONES_CHINPOKOMON = List.of(
        new Transformacion(
            "Charizardo",
            35, 
            15,
            "bola de fuego",
            "alas escudo"
        ),
        new Transformacion(
            "Chikorisa",
            40, 
            5,
            "latigo cepa",
            "hojas inutiles"
        ),
        new Transformacion(
            "Spritle",
            20, 
            25,
            "pistola de agua",
            "caparazon de acero"
        )
    );

    public static List<Transformacion> TRANSFORMACIONES_COPCAM = List.of(
        new Transformacion(
            "Fire Soul",
            35, 
            7,
            "lanzallamas",
            "calentar armadura"
        ),
        new Transformacion(
            "Ice Pegasus",
            35, 
            25,
            "rayo congelador",
            "barrera de hielo"
        ),
        new Transformacion(
            "Wind Soul",
            35, 
            10,
            "torbellino",
            "barrera de viento"
        )
    );

    public static List<Transformacion> TRANSFORMACIONES_NIENTIENDO = List.of(
        new Transformacion(
            "Hyperlink",
            33, 
            15,
            "su espada",
            "giro veloz"
        ),
        new Transformacion(
            "Ladrillo",
            20, 
            45,
            "caida en la cabeza",
            "dureza de ladrillo"
        ),
        new Transformacion(
            "Don Kingkon",
            20, 
            10,
            "sus puños",
            "cubriendose"
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

    /**
     * Metodo para imprimir en pantalla un texto
     * @param line Linea de texto que se desea imprimir
     */
    public static void println(String line) {
        System.out.println(line);
    }

    /**
     * Metodo para obtener un numero aleatorio
     * @param inicio Inicio del intervalo del cual se desea obtener el numero aleatorio
     * @param fin Fin del intervalo del cual se desea obtener el numero aleatorio
     * @return int 
     */
    public static int obtenerNumeroAleatorioEntre(int inicio, int fin) {
        return (int) Math.random()*fin + inicio;
    }
}
