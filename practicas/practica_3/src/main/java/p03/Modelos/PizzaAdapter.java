
/**
 * Clase que adapta una instancia de la clase Pizza para comportarse como un baguette. Extiende de la clase Baguette.
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class PizzaAdapter extends Baguette{

    private Pizza pizza;

    /**
     * Metodo constructor con parametros de la clase
     * @param pizza Instancia de la clase Pizza
     */
    public PizzaAdapter(Pizza pizza){
        this.pizza = pizza;
    }

    /**
     * Metodo para obtener la descripcion de la pizza en como si fuera un baguette, pero haciendo uso de los metodos de la clase pizza
     * @return String
     */
    @Override
    public String getDescripcion(){
        return "Pizza con masa"+ pizza.getMasa() +", queso " + pizza.getQueso() +" y "+pizza.getCarne();
    }

    /**
     * Metodo para obtener el precio de la pizza como si fuese una baguette
     * @return double
     */
    @Override
    public double getPrecio(){
        return pizza.getPrecio();
    }
}