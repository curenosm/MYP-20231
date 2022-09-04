package p01;
import java.util.ArrayList;
import java.util.List;

import p01.interfaces.Observador;
import p01.interfaces.Sujeto;

/**
 * Clase intermediaria para la comunicacion.
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
    public Audiencia(List<Espectador> espectadores, Combate combate) {
        this.espectadores = new ArrayList<>();
        this.combate = combate;
    }

    @Override
    /**
     * Metodo para actualizar las bitacoras de los espectadores que conforman la lista de la clase
     * @param evento Suceso a registrar y del cual se notifica
     */
    public void notificar(String evento) {
        espectadores.forEach(
            espectador -> espectador.actualizar(evento)
        );
    }

    @Override
    /**
     * Metodo que llama a notificar para actualizar las bitacoras de los especadores
     * @param registro Evento del cual se desea hacer un registro en las bitacoras, representado en una cadena de texto
     */
    public void actualizar(String registro) {
        notificar(registro);
    }
    
}
