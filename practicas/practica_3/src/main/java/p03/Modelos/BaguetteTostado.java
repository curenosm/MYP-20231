
/**
 * Clase que simula un baguette con pan tostado. Extiende de Baguette
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class BaguetteTostado extends Baguette{

    /**
     * Metodo conatructor sin parametros de la clase
     */
    public BaguetteTostado(){
        this.descripcion="Baguette con pan tostado";
        this.precio= 40;
    }

    /**
     * Metodo para obtener la descripcion del baguette de pan tostado
     * @return String
     */
    @Override
    public String getDescripcion(){
        return super.getDescripcion() + this.descripcion;
    }

    /**
     * Metodo para obtener el precio del baguette de pan tostado
     * @return double
     */
    @Override
    public double getPrecio(){
        return super.precio + this.precio;
    }
}