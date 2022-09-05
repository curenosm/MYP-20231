package p01.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que simula una bitacora en la cual se registran los eventos de un combate
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Bitacora {

    public List<String> registros;

    /**
     * Metodo constructor de la clase sin parametros
     */
    public Bitacora() {
        this.registros = new ArrayList<>();
        this.registros.add("EMPIEZA LA TRANSMISION");
    }

    /**
     * Metodo para escribir la bitacora
     * @param registro String con lo que se va registrar
     */
    public void escribir(String registro) {
        registros.add(registro + "\n");
    }
}
