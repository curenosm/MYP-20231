package p01;
import p01.interfaces.ComportamientoDefensa;
import p01.interfaces.ComportamientoAtaque;

public class Personaje implements ComportamientoAtaque, ComportamientoDefensa {
    public Franquicia franquicia;
    public Integer puntosDeVida;
    public Transformacion powerUpActual;
    public String nombre;

    public Personaje(Franquicia franquicia, String nombre) {
        this.franquicia = franquicia;
        this.puntosDeVida = 1000;
        this.powerUpActual = null;
        this.nombre = nombre;
    }

    @Override
    public void atacar(Personaje enemigo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Integer defender(Integer puntosDelAtaque) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
