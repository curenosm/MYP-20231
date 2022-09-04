package p01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import p01.util.Constantes;
import static p01.util.Constantes.println;;

/**
 * Clase principal del programa.
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Main {

    public List<Espectador> espectadores;
    public Audiencia audiencia;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    /**
     * Inicia la ejecución de nuestro programa.
     */
    public void start() {
        println("EMPIEZA LA TRANSMISION\n");

        inicializarEspectadores();
        audiencia.notificar("EMPIEZAN LAS APUESTAS\n");

        audiencia.notificar("EL COMBATE HA EMPEZADO\n");
        inicializarCombate();
        
        println("FIN DE LA TRANSMISION");
    }
    
    /**
     * Metodo que recibe el nomnbre de los espectadores,
     * asi como su personaje favorito.
     */
    public void inicializarEspectadores() {

        espectadores = new ArrayList<>();

        espectadores.addAll(
            List.of(
                new Espectador(1L, audiencia, null, new Bitacora()),
                new Espectador(2L, audiencia, null, new Bitacora()),
                new Espectador(3L, audiencia, null, new Bitacora()),
                new Espectador(4L, audiencia, null, new Bitacora())
            )
        );

        for (int i = 0; i < espectadores.size(); i++) {

            Espectador espectadorActual = espectadores.get(i);
            
            espectadorActual.actualizar("\n### Quien es tu personaje favorito? ###");
            espectadorActual.actualizar("0. Korby");
            espectadorActual.actualizar("1. MeganMan");
            espectadorActual.actualizar("2. Dittuu");
            espectadorActual.actualizar("#######################################\n");

            espectadorActual.personajeFavoritoActual = Constantes.PERSONAJES.get(i%3);
        }

        audiencia = new Audiencia(espectadores);

        IntStream.range(0, espectadores.size())
            .forEach(i -> {
                Espectador e = espectadores.get(i);

                audiencia.notificar(
                    "El espectador " + e.toString() 
                    + " ha escogido como su favorito a: " 
                    + e.personajeFavoritoActual.toString() + "\n"
                );
            });
        
    }

    public void inicializarCombate() {
        Combate combate = new Combate(Constantes.PERSONAJES);
        audiencia.combate = combate;
        combate.audiencia = audiencia;
        audiencia.combate.iniciar();
    }

}