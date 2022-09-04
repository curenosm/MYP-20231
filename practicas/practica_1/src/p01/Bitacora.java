package p01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 * Clase que simula una bitacora en la cual se registran los eventos de un combate
 */
public class Bitacora {

    public List<String> registros;

    /**
     * Metodo constructor de la clase sin parametros
     */
    public Bitacora() {
        this.registros = new ArrayList<>();
    }

    /**
     * Metodo para escribir la bitacora
     * @param registro String con lo que se va registrar
     */
    public void escribir(String registro) {
        registros.add(registro);
    }
}
