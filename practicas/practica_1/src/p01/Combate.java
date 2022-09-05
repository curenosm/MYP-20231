package p01;

import java.util.ArrayList;
import java.util.List;

import p01.interfaces.Sujeto;
import p01.util.Constantes;

import static p01.util.Constantes.println;
import static p01.util.Constantes.obtenerNumeroAleatorioEntre;

/**
 *  * Clase que simula un combate 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 * @note Esta clase implementa la interfaz Sujeto para notificar a los espectadores de lo que ocurrre
 */
public class Combate implements Sujeto {

    public List<Personaje> contricantes;
    public Personaje ganador;
    public Audiencia audiencia;

    public Personaje korby;
    public Personaje meganMan;
    public Personaje dittuu;
    public boolean termino = true;

    /**
     * Metodo constructor de la clase sin parametros
     */
    public Combate() {
        this.contricantes = new ArrayList<>();
    }

    /**
     * Metodo constructor de la clase con parametros
     * @param contrincantes Lista de personajes que participaran en el combate
     */
    public Combate(List<Personaje> contrincantes) {
        this.contricantes = contrincantes;

        korby = contricantes.get(0);
        meganMan = contricantes.get(1);
        dittuu = contricantes.get(2);
    }

    public void asignarPowerUpAleatorioAPersonaje() {

        int indicePersonaje = obtenerNumeroAleatorioEntre(
            0,
            contricantes.size()
        );

        // TODO: Modificar para combates más dinamicos
        Personaje personajeSeleccionado = contricantes.get(Constantes.GANADOR);

        personajeSeleccionado.powerUpActual = personajeSeleccionado.franquicia.obtenerTransformacion();

        notificar(personajeSeleccionado.nombre 
            + " ha tomado un power up, se ha transformado en " 
            + personajeSeleccionado.powerUpActual.toString()
        );

        // A todos los demás quitales el power up
        this.contricantes.stream()
            .filter(c -> !personajeSeleccionado.equals(c))
            .forEach(c -> {
                c.powerUpActual = null;
            });

    }

    /**
     * Metodo para iniciar el combate
     */
    public void iniciar() {

        termino = false;

        try {
            
            int turnoActual = 0;

            while (!combateTermino()) {
                
                if (turnoActual%3 == 0) {
                    asignarPowerUpAleatorioAPersonaje();
                } else {
                    desasignarPowerUp();
                }
                
                switch (Constantes.GANADOR.intValue()) {
                    case 0: // Gana Korby
                        secuenciaPelea(korby);
                    break;
                    case 1: // Gana MeganMan
                        secuenciaPelea(meganMan);
                    break;
                    case 2: // Gana Dittuu
                        secuenciaPelea(dittuu);
                    break;
                    default: // Gana Korby
                        secuenciaPelea(korby);
                    break;
                }
                
                Thread.sleep((long) (2000*Constantes.VELOCIDAD_EJECUCION));

                turnoActual++;
            }

            notificar("EL COMBATE HA TERMINADO");
            notificar("HA GANADO " + ganador.toString());
            

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void secuenciaPelea(Personaje atacante) {

        this.contricantes
            .stream()
            .filter(c -> !c.equals(atacante))
            .forEach(c -> {
                if (c.estaVivo()) {
                    notificar(
                        atacante.nombre + " ataca a " + c.nombre + " " + atacante.eventoAtaque()
                    );
                    atacante.atacar(c);
                    notificar(c.nombre + " se defiende " + c.eventoDefensa());
                }
            });
    }

    /**
     * Metodo para cuando el combate finaliza.
     * 
     * @return boolean
     */
    public boolean combateTermino() {

        if (!termino) {
            imprimirPuntosDeVida();
        }

        // Checamos que solo quede uno con vida
        if (korby.estaVivo() && !meganMan.estaVivo() && !dittuu.estaVivo()) {
            this.ganador = korby;
            termino = true;
        } else if (!korby.estaVivo() && meganMan.estaVivo() && !dittuu.estaVivo()) {
            this.ganador = meganMan;
            termino = true;
        } else if (!korby.estaVivo() && !meganMan.estaVivo() && dittuu.estaVivo()) {
            this.ganador = dittuu;
            termino = true;
        }
        
        return termino;
    }

    public void imprimirPuntosDeVida() {
        
        notificar("\n####################################");

        this.contricantes
            .stream()
            .forEach(c -> {
                notificar( c.puntosDeVida > 0 ?
                    "Vida de " + c.nombre + ": " + c.puntosDeVida + "/" + Constantes.PUNTOS_DE_VIDA_INICIALES :
                    c.nombre + " ha sido derrotado en el combate. "
                );
            });

        notificar("####################################\n");
    }

    public void desasignarPowerUp() {
        this.contricantes
            .stream()
            .forEach(c -> c.powerUpActual = null);
    }

    /**
     * Metodo que notifica a los espectadores los eventos ocurridos durante el combate
     * @param evento Cadena de texto con lo que ocurre durante el combate
     */
    @Override
    public void notificar(String evento) {
        this.audiencia.actualizar(evento);
    }
    
}
