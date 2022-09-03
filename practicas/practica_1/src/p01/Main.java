package p01;

import java.util.ArrayList;
import java.util.List;

import p01.util.Constantes;
import static p01.util.Constantes.println;

/**
 * Main
 */
public class Main {

    public List<Espectador> espectadores;
    public Grupo grupo;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        println("EMPIEZA LA TRANSMISION\n");

        println("EMPIEZAN LAS APUESTAS\n");
        inicializarEspectadores();

        println("EL COMBATE HA EMPEZADO\n");
        inicializarCombate();

    }
    
    public void inicializarEspectadores() {

        espectadores = new ArrayList<>();
        espectadores.addAll(
            List.of(
                new Espectador(1L, grupo, null, new Bitacora()),
                new Espectador(2L, grupo, null, new Bitacora()),
                new Espectador(3L, grupo, null, new Bitacora())
            )
        );

        for (int i = 0; i < 3; i++) {
            println("\n### Quien es tu personaje favorito? ###");
            println("0. Korby");
            println("1. MeganMan");
            println("2. Dittuu");
            println("#######################################\n");

            espectadores.get(i).personajeFavoritoActual = Constantes.PERSONAJES.get(i);

            println("El espectador " 
                + espectadores.get(i).toString()
                + " ha escogido como su favorito a: " 
                + Constantes.PERSONAJES.get(i) 
                + "\n"
            );
        }
    }

    public void inicializarCombate() {
        Combate combate = new Combate(Constantes.PERSONAJES);
        grupo = new Grupo(espectadores, combate);
        grupo.combate.iniciar();
    }

}