package p01;

import java.util.ArrayList;
import java.util.List;

import p01.interfaces.Sujeto;

import static p01.util.Constantes.println;

public class Combate implements Sujeto {

    public List<Personaje> contricantes;
    public Personaje ganador;
    public Audiencia audiencia;

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
        try {
            int i = 0;

            while (!combateTermino()) {

                if (i%4 == 0) {
                    korby.powerUpActual =  korby.franquicia.obtenerTransformacion();
                    
                    println("Korby ha tomado un power up, se ha transformado en " + korby.powerUpActual.toString());
                }
                else {
                    korby.powerUpActual = null;
                }
                
                println("Korby ataca a MeganMan " + korby.eventoAtaque());
                korby.atacar(meganMan);
                println("MeganMan se defiende " + meganMan.eventoDefensa());

                println("Korby ataca a Dittuu "  + korby.eventoAtaque());
                korby.atacar(dittuu);
                println("Dittuu se defiende " + dittuu.eventoDefensa());

                Thread.sleep(300);

                i++;
            }

            notificar("EL COMBATE HA TERMINADO");
            notificar("HA GANADO " + ganador.toString());

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean combateTermino() {
        println("\n####################################");
        println("Vida de Korby " + korby.puntosDeVida);
        println("Vida de MeganMan " + meganMan.puntosDeVida);
        println("Vida de Dittuu " + dittuu.puntosDeVida);
        println("####################################\n");


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

    @Override
    public void notificar(String evento) {
        this.audiencia.notificar(evento);
    }
    
}
