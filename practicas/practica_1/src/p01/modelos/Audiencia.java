package p01.modelos;
import java.util.List;

import p01.interfaces.Observador;
import p01.interfaces.Sujeto;

import static p01.util.Constantes.println;

/**
 * Clase intermediaria para la comunicacion entre las peleas y los espectadores.
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 * 
 * @implNote Esta clase implementa Sujeto y Obersvador a la vez
 * porque por un lado los espectadores se suscriben para ser parte de la
 * audiencia y a su vez la Audiencia observa el combate.
 */
public class Audiencia implements Sujeto, Observador {

    public List<Espectador> espectadores;
    public Combate combate;

    /**
     * Metodo constructor de la clase
     * @param espectadores Lista de instancias de la clase Espectador
     * @param combate Instancia de la clase Combate
     */
    public Audiencia(List<Espectador> espectadores) {
        this.espectadores = espectadores;
        this.combate = null;
    }


    /**
     * Metodo constructor de la clase
     * @param espectadores Lista de instancias de la clase Espectador
     * @param combate Instancia de la clase Combate
     */
    public Audiencia(List<Espectador> espectadores, Combate combate) {
        this.espectadores = espectadores;
        this.combate = combate;
    }

    /**
     * Metodo para actualizar las bitacoras de los espectadores que conforman la lista de la clase
     * @param evento Suceso a registrar y del cual se notifica
     */
    @Override
    public void notificar(String evento) {

        // Simplemente imprime el evento si aun no hay espectadores
        if (espectadores.isEmpty()) {
            println(evento);
        }

        // Informales a todos de los acontecimientos
        espectadores.forEach(
            espectador -> {
                espectador.actualizar(evento);

                // Cuando el combate termine genera las bitacoras de lo que vio cada espectador
                if (combate != null) {
                    if (combate.termino) {
                        espectador.generarBitacora();
                    }
                }
            }
        );

    }

    /**
     * Metodo que llama a notificar para actualizar las bitacoras de los especadores
     * @param registro Evento del cual se desea hacer un registro en las bitacoras, representado en una cadena de texto
     */
    @Override
    public void actualizar(String registro) {
        notificar(registro);
    }
    
}
