public class Personaje implements ComportamientoAtaque, ComportamientoDefensa {
    public Franquicia franquicia;
    public Integer puntosDeVida;
    public Transformacion powerUpActual;

    public Personaje(Franquicia franquicia) {
        this.franquicia = franquicia;
        this.puntosDeVida = 1000;
        this.powerUpActual = null;
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
}
