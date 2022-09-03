import java.util.ArrayList;
import java.util.List;

public class Franquicia {
    public String nombre;
    public List<Transformacion> transformaciones; 

    public Franquicia() {
        this.transformaciones = new ArrayList<>();
    }

    public Franquicia(String nombre, List<Transformacion> transformaciones) {
        this.nombre = nombre;
        this.transformaciones = transformaciones;
    }

    public Transformacion obtenerTransformacion() {
        return transformaciones.get(0);
    }
}
