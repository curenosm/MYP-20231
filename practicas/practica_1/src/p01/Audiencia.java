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

    public Audiencia(List<Espectador> espectadores, Combate combate) {
        this.espectadores = new ArrayList<>();
        this.combate = combate;
    }

    @Override
    public void notificar(String evento) {
        espectadores.forEach(
            espectador -> espectador.actualizar(evento)
        );
    }

    @Override
    public void actualizar(String registro) {
        notificar(registro);
    }
    
}
