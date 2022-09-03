package p01;

import java.util.ArrayList;
import java.util.List;

import static p01.util.Constantes.println;

public class Combate {
    public List<Personaje> contricantes;
    public Personaje ganador;

    public Personaje korby;
    public Personaje meganMan;
    public Personaje dittuu;

    public Combate() {
        this.contricantes = new ArrayList<>();
    }

    public Combate(List<Personaje> contrincantes) {
        this.contricantes = contrincantes;

        korby = contricantes.get(0);
        meganMan = contricantes.get(1);
        dittuu = contricantes.get(2);
    }

    public void iniciar() {
        while (!combateTermino()) {
            println("Korby ataca a MeganMan");
            System.out.println(meganMan);
            korby.atacar(meganMan);
            korby.powerUpActual = korby.franquicia.obtenerTransformacion();

            println("Korby ataca a Dittuu");
            korby.atacar(dittuu);
        }
    }

    public boolean combateTermino() {

        // Checamos que solo quede uno con vida
        if (korby.estaVivo() && !meganMan.estaVivo() && !dittuu.estaVivo()) {
            this.ganador = korby;
            return true;
        } else if (!korby.estaVivo() && meganMan.estaVivo() && !dittuu.estaVivo()) {
            this.ganador = meganMan;
            return true;
        } else if (!korby.estaVivo() && !meganMan.estaVivo() && dittuu.estaVivo()) {
            this.ganador = dittuu;
            return true;
        }
        
        return false;
    }
}
