import java.util.ArrayList;
import java.util.List;

public class Bitacora {

    public List<String> registros;

    public Bitacora() {
        this.registros = new ArrayList<>();
    }

    public void escribir(String registro) {
        registros.add(registro);
    }
}
