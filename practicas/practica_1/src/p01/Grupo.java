package p01;
import java.util.ArrayList;
import java.util.List;

import p01.interfaces.Sujeto;

public class Grupo implements Sujeto {

    public List<Espectador> espectadores;
    public Combate combate;

    public Grupo(List<Espectador> espectadores, Combate combate) {
        this.espectadores = new ArrayList<>();
        this.combate = new Combate();
    }

    @Override
    public void notificar() {
        espectadores.forEach(espectador -> espectador.actualizarBitacora(""));
    }
    
}
