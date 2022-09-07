package p01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.Scanner;

import p01.modelos.Audiencia;
import p01.modelos.Bitacora;
import p01.modelos.Combate;
import p01.modelos.Espectador;
import p01.util.Constantes;
import static p01.util.Constantes.println;

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
    public Scanner scanner = new Scanner(System.in);

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

        // Aquí se elige el caso de prueba (Que personaje ganara)
        println("Que caso de prueba desea ejecutar? ");
        println("0. Gana Korby");
        println("1. Gana MeganMan");
        println("2. Gana Dittuu\n");
        
        try {
            int opcionSeleccionada = scanner.nextInt();
            if (0 <= opcionSeleccionada && opcionSeleccionada <= 2) {
                Constantes.GANADOR = opcionSeleccionada;
            } else {
                throw new Exception("Por favor, elija una opcion valida\n");
            }
        }
        catch (IOException e) {
            println("Elija una de las opciones listadas\n");
            inicializarEspectadores();
        }
        catch (Exception e) {
            println(e.getMessage());
            inicializarEspectadores();
        }
        finally {
            scanner = new Scanner(System.in);
        }

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
            
            boolean espectadorAposto = false;
            
            do { 
                try {
                
                    espectadorActual.actualizar("\n######################## Espectador " + espectadorActual.toString() + " ########################");
                    espectadorActual.actualizar("############# Quien es tu personaje favorito? ################");
                    espectadorActual.actualizar("0. Korby");
                    espectadorActual.actualizar("1. MeganMan");
                    espectadorActual.actualizar("2. Dittuu");
                    espectadorActual.actualizar("##############################################################\n");
                    
                    println("\n######################## Espectador " + espectadorActual.toString() + " ########################");
                    println("############# Quien es tu personaje favorito? ################");
                    println("0. Korby");
                    println("1. MeganMan");
                    println("2. Dittuu\n");

                    int opcionSeleccionada = scanner.nextInt();
                    if (0 <= opcionSeleccionada && opcionSeleccionada <= 2) {
                        espectadorActual.personajeFavoritoActual = Constantes.PERSONAJES.get(opcionSeleccionada);
                        espectadorAposto = true;
                    } else {
                        throw new Exception("Por favor, elija una opcion valida\n");
                    }
                }
                catch (IOException e) {
                    println("Elija una de las opciones listadas\n");
                    
                }
                catch (Exception e) {
                    println(e.getMessage());
                }
                finally {
                    scanner = new Scanner(System.in);
                }
            } while (!espectadorAposto);
        }
    

        audiencia = new Audiencia(espectadores);

        IntStream.range(0, espectadores.size())
            .forEach(i -> {
                Espectador e = espectadores.get(i);

                audiencia.notificar(
                    "El espectador " + e.toString() 
                    + " ha escogido como su favorito a: " 
                    + e.personajeFavoritoActual.toString()
                );
            });
        
    }

    /**
     * Metodo para inicializar el combate
     */
    public void inicializarCombate() {
        Combate combate = new Combate(Constantes.PERSONAJES);
        audiencia.combate = combate;
        combate.audiencia = audiencia;
        audiencia.combate.iniciar();
    }

}