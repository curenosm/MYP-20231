

/**
 * Clase que simula el ingrediente cebolla. Extiende de BaguetteDecorador
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class Cebolla extends BaguetteDecorador{

    /**
     * Constructor con parametros de la clase
     * @param pan Instancia de la clase Baguette
     */
    public Cebolla(Baguette pan){
        super(pan);
    }

    /**
     * Metodo que devuelve la descripcion del atributo pan de la clase y el ingrediente cebolla
     * @return String
     */
    public String getDescripcion(){
        return pan.getDescripcion() + ",cebolla";
    }

    /**
     * Metodo para obtener el precio base del objeto pan y sumarle el precio del ingrediente cebolla
     * @return double
     */
    public double getPrecio(){
        return pan.getPrecio()+1.2;
    }
}