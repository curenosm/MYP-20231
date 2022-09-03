package p01;

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static Grupo grupo;
    public static List<Franquicia> franquicias;
    public static List<Espectador> espectadores;
    public static List<Transformacion> transformacionesNientiendo;
    public static List<Transformacion> transformacionesCopcam;
    public static List<Transformacion> transformacionesChinpokomon;
    public static List<Personaje> contrincantes;
    public static Combate combate;

    public static void main(String[] args) {

        inicializarEspectadores();
        inicializarFranquicias();
        inicializarCombate();

        grupo = new Grupo(espectadores, combate);
    }

    public static void inicializarEspectadores() {
        espectadores = new ArrayList<>();
        espectadores.addAll(
            List.of(
                new Espectador(1L, grupo, null, new Bitacora()),
                new Espectador(2L, grupo, null, new Bitacora()),
                new Espectador(3L, grupo, null, new Bitacora())
            )
        );
    }

    public static void inicializarFranquicias() {

        transformacionesNientiendo = new ArrayList<>();
        transformacionesCopcam = new ArrayList<>();
        transformacionesChinpokomon = new ArrayList<>();

        // Agregamos los chipokomones a los que se podria transformar Dittu
        transformacionesNientiendo.addAll(
            List.of(
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
            )
        );

        // Agregamos las transformaciones de Meganman
        transformacionesCopcam.addAll(
            List.of(
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
            )
        );

        // Agregamos los personajes de Nientiendo en los que se transforma Kirbi     
        transformacionesNientiendo.addAll(
            List.of(
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
            )
        );

        franquicias = new ArrayList<>();
        franquicias.addAll(
            List.of(
                new Franquicia("Nientiendo", transformacionesNientiendo),
                new Franquicia("Copcam", transformacionesCopcam),
                new Franquicia("Chinpokomon", transformacionesChinpokomon)
            )
        );
    }

    public static void inicializarCombate() {

        contrincantes = new ArrayList<>();

        contrincantes.addAll(
            List.of(
                new Personaje(franquicias.get(0), "Korby"),
                new Personaje(franquicias.get(1), "MeganMan"),
                new Personaje(franquicias.get(2), "Dittuu")
            )
        );

        combate = new Combate(contrincantes);
    }
}