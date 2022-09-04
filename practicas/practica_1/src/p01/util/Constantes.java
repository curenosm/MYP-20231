package p01.util;

import java.util.List;

import p01.Franquicia;
import p01.Personaje;
import p01.Transformacion;

import static p01.util.Ataques.*;
import static p01.util.Defensas.*;

/**
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 * Clase con las constantes que seran utilizadas para el torneo
 */
public final class Constantes {

    public static final String DIRECTORIO_BITACORAS = "./bitacoras/";

    public static final Integer PUNTOS_ATAQUE_BASE = 20;
    public static final Integer PUNTOS_DEFENSA_BASE = 5;
    public static final Integer PUNTOS_DE_VIDA_INICIALES = 100;
    public static final Double VELOCIDAD_EJECUCION = 0.1;
    public static final Integer GANADOR = 0;
    
    public static List<Transformacion> TRANSFORMACIONES_CHINPOKOMON = List.of(
        new Transformacion(
            "Charizardo",
            35, 
            15,
            ataqueBolaDeFuego,
            defensaAlasEscudo
        ),
        new Transformacion(
            "Chikorisa",
            40, 
            5,
            ataqueLatigoCepa,
            defensaHojasInutiles
        ),
        new Transformacion(
            "Spritle",
            20, 
            25,
            ataquePistolaDeAgua,
            defensaCaparazonDeAcero
        )
    );

    public static List<Transformacion> TRANSFORMACIONES_COPCAM = List.of(
        new Transformacion(
            "Fire Soul",
            35, 
            7,
            ataqueLanzallamas,
            defensaCalentarArmadura
        ),
        new Transformacion(
            "Ice Pegasus",
            35, 
            10,
            ataqueRayoCongelador,
            defensaBarreraDeHielo
        ),
        new Transformacion(
            "Wind Soul",
            35, 
            5,
            ataqueTorbellino,
            defensaBarreraDeViento
        )
    );

    public static List<Transformacion> TRANSFORMACIONES_NIENTIENDO = List.of(
        new Transformacion(
            "Hyperlink",
            33, 
            15,
            ataqueEspada,
            defensaGiroVeloz
        ),
        new Transformacion(
            "Ladrillo",
            20, 
            45,
            ataqueCaidaEnCabeza,
            defensaDurezaDeLadrillo
        ),
        new Transformacion(
            "Don Kingkon",
            20, 
            10,
            ataquePuños,
            defensaCubrirse
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

    public static final List<Personaje> PERSONAJES = List.of(
        new Personaje(FRANQUICIAS.get(0), "Korby", PUNTOS_ATAQUE_BASE, PUNTOS_DEFENSA_BASE),
        new Personaje(FRANQUICIAS.get(1), "MeganMan", PUNTOS_ATAQUE_BASE, PUNTOS_DEFENSA_BASE),
        new Personaje(FRANQUICIAS.get(2), "Dittuu", PUNTOS_ATAQUE_BASE, PUNTOS_DEFENSA_BASE)
    );

    /**
     * Metodo para imprimir en pantalla un texto
     * @param line Linea de texto que se desea imprimir
     */
    public static void println(String line) {
        System.out.println(line);
    }

    /**
     * Metodo para obtener un numero aleatorio.
     * 
     * @param inicio Inicio del intervalo del cual se desea obtener el numero aleatorio
     * @param fin Fin del intervalo del cual se desea obtener el numero aleatorio
     * @return int 
     */
    public static int obtenerNumeroAleatorioEntre(int inicio, int fin) {
        return (int) ((Math.random()*(fin - inicio)) + inicio);
    }

}
