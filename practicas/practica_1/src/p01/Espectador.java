package p01;

import java.time.Instant;

import p01.interfaces.Observador;

public class Espectador implements Observador {

    public Long id;
    public Audiencia audiencia;
    public Personaje personajeFavoritoActual;
    public Bitacora bitacora;

    public Espectador() {
        this.id = Instant.now().toEpochMilli();
    }

    public Espectador(Long id,
                        Audiencia audiencia,
                        Personaje personajeFavoritoActual,
                        Bitacora bitacora) {
        this.id = id;
        this.audiencia = audiencia;
        this.personajeFavoritoActual = personajeFavoritoActual;
        this.bitacora = bitacora;
    }

    @Override
    public void actualizar(String registro) {
        bitacora.escribir(registro);
    }

    @Override
    public String toString() {
        return id + "";
    }

}
