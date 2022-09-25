

/**
 * Clase que simula a una pizza
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Pizza{
    protected String queso;
    protected String carne;
    protected String masa;
    protected double precio;

    /**
     * Metodo para obtener el tipo de queso de la pizza
     * @return String
     */
    public String getQueso(){
        return this.queso;
    }

    /**
     * Metodo para obtener el tipo de carne de la pizza
     * @return String
     */
    public String getCarne(){
        return this.carne;
    }

    /**
     * Metodo para obtener el tipo de masa de la pizza
     * @return String
     */
    public String getMasa(){
        return this.masa;
    }

    /**
     * Metodo para obtener el precio de la pizza
     * @return double
     */
    public double getPrecio(){
        return this.precio;
    }

}