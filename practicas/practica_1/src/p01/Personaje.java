package p01;
import p01.interfaces.ComportamientoDefensa;
import p01.interfaces.ComportamientoAtaque;

import static p01.util.Constantes.println;

public class Personaje implements ComportamientoAtaque, ComportamientoDefensa {
    public Franquicia franquicia;
    public Integer puntosDeVida;
    public Transformacion powerUpActual;
    public String nombre;
    public Integer puntosAtaqueBase;
    public Integer puntosDefensaBase;

    public Personaje(Franquicia franquicia, 
                        String nombre,
                        Integer puntosAtaqueBase,
                        Integer puntosDefensaBase) {
        this.franquicia = franquicia;
        this.puntosDeVida = 1000;
        this.powerUpActual = null;
        this.nombre = nombre;
    }

    @Override
    public void atacar(Personaje enemigo) {
        println(enemigo.toString());
        enemigo.puntosDeVida -= enemigo.defender(this.obtenerPuntosAtaque());
        println(enemigo.powerUpActual.toString());
    }

    public Integer obtenerPuntosAtaque() {
        if (this.powerUpActual != null) {
            return this.puntosAtaqueBase + this.powerUpActual.puntosAtaque;
        }
        
        return this.puntosAtaqueBase;
    }

    public Integer obtenerPuntosDefensa() {
        if (this.powerUpActual != null) {
            return this.puntosAtaqueBase + this.powerUpActual.puntosDefensa;
        }

        return this.puntosDefensaBase;
    }

    @Override
    public Integer defender(Integer puntosDelAtaque) {
        return puntosDelAtaque -= this.obtenerPuntosDefensa();
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }
}
