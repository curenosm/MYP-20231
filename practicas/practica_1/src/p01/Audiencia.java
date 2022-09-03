package p01;
import java.util.ArrayList;
import java.util.List;

import p01.interfaces.Observador;
import p01.interfaces.Sujeto;

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
