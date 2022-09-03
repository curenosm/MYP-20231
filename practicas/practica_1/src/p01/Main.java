package p01;

import java.util.ArrayList;
import java.util.List;

import p01.util.Constantes;

/**
 * Main
 */
public class Main {

    public List<Franquicia> franquicias = Constantes.FRANQUICIAS;
    public List<Personaje> contrincantes = Constantes.PERSONAJES;
    public List<Espectador> espectadores;
    public Combate combate;
    public Grupo grupo;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        println("EMPIEZA LA TRANSMISION");

        inicializarEspectadores();
        inicializarCombate();

        grupo = new Grupo(espectadores, combate);

    }
    
    public void inicializarEspectadores() {
        println("EMPIEZAN LAS APUESTAS");

        for (int i = 0; i < 3; i++) {
            println("El espectador " 
                + (i + 1) 
                + " ha escogido como su favorito a: " 
                + Constantes.PERSONAJES.get(i) 
            );
        }

        espectadores = new ArrayList<>();
        espectadores.addAll(
            List.of(
                new Espectador(1L, grupo, null, new Bitacora()),
                new Espectador(2L, grupo, null, new Bitacora()),
                new Espectador(3L, grupo, null, new Bitacora())
            )
        );
    }

    public void inicializarCombate() {
        println("EL COMBATE HA EMPEZADO");
        combate = new Combate(contrincantes);
    }

    public static void println(String line) {
        System.out.println(line);
    }
}