package p01;

import java.util.ArrayList;
import java.util.List;

public class Combate {
    public List<Personaje> contricantes;
    public Personaje ganador;

    public Combate() {
        this.contricantes = new ArrayList<>();
    }

    public Combate(List<Personaje> contrincantes) {
        this.contricantes = contrincantes;
    }

    public void iniciar() {
        
    }
}
