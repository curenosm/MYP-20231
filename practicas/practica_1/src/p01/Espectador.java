package p01;

import java.io.File;
import java.time.Instant;

import p01.interfaces.Observador;
import p01.util.Constantes;
import p01.util.WriteFile;
import static p01.util.Constantes.println;

/**
 * Clase que simula un espectador que observa el combate.
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 * @implNote Esta clase implementa la interfaz observador, pues recibira notificaciones de lo ocurrido en el combate
 */
public class Espectador implements Observador {

    public Long id;
    public Audiencia audiencia;
    public Personaje personajeFavoritoActual;
    public Bitacora bitacora;

    /**
     * Metodo constructor sin parametros
     */
    public Espectador() {
        this.id = Instant.now().toEpochMilli();
    }

    /**
     * Metodo constructor con parametros
     * @param id Identificador del espectador
     * @param audiencia Instancia de la clase Audiencia
     * @param personajeFavoritoActual Instancia de la clase Personaje al cual el espectador apoya
     * @param bitacora Instancia de la clase Bitacora sobre la que se escribe lo sucedido
     */
    public Espectador(Long id,
                        Audiencia audiencia,
                        Personaje personajeFavoritoActual,
                        Bitacora bitacora) {
        this.id = id;
        this.audiencia = audiencia;
        this.personajeFavoritoActual = personajeFavoritoActual;
        this.bitacora = bitacora;
    }

    /**
     * Metodo que actualiza y registra los eventos ocurridos en la bitacora del espectador 
     */
    @Override
    public void actualizar(String registro) {
        println(registro);
        bitacora.escribir(registro);
    }

    /**
     * Metodo para representar en cadena al objeto
     * @return String
     */
    @Override
    public String toString() {
        return id + "";
    }

    /**
     * Metodo que genera la bitacora de eventos presentados a cada espectador.
     */
    public void generarBitacora() {

        String res = bitacora
            .registros
            .stream()
            .reduce("", (s, a) -> {
                return s + a;
            });

        WriteFile.writeUsingFiles(
            Constantes.DIRECTORIO_BITACORAS + "BITACORA_ESPECTADOR_" + this.id + ".log",
            res
        );

    }

}
