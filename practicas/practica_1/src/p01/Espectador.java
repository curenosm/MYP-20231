package p01;

import java.time.Instant;

import p01.interfaces.Observador;

public class Espectador implements Observador {

    public Long id;
    public Grupo grupo;
    public Personaje personajeFavoritoActual;
    public Bitacora bitacora;

    public Espectador() {
        this.id = Instant.now().toEpochMilli();
    }

    public Espectador(Long id,
                        Grupo grupo,
                        Personaje personajeFavoritoActual,
                        Bitacora bitacora) {
        this.id = id;
        this.grupo = grupo;
        this.personajeFavoritoActual = personajeFavoritoActual;
        this.bitacora = bitacora;
    }

    @Override
    public void actualizarBitacora(String registro) {
        bitacora.escribir(registro);
    }

}
