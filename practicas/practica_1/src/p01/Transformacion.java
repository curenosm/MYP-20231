package p01;

public class Transformacion {
    public String nombre;
    public Integer puntosAtaque;
    public Integer puntosDefensa;
    public String eventoAtaque;
    public String eventoDefensa;


    public Transformacion(String nombre,
                            Integer puntosAtaque,
                            Integer puntosDefensa,
                            String eventoAtaque,
                            String eventoDefensa) {
        this.nombre = nombre;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.eventoAtaque = eventoAtaque;
        this.eventoDefensa = eventoDefensa;
    }
}
