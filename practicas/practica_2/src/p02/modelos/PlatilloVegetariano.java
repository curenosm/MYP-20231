package p02.modelos;

import java.math.BigDecimal;


/**
 * Clase que representa un platillo que NO lleva carne, mayonesa y tampoco queso.
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class PlatilloVegetariano extends Platillo {

    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private final Boolean tieneQueso = false;
    private final Boolean esVegetariano = true;
    
    public PlatilloVegetariano() {
        super(null);
    }

    public PlatilloVegetariano(
            Long id,
            String nombre,
            String descripcion, 
            BigDecimal precio) {
        super(id);
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public boolean llevaQueso() {
        return tieneQueso;
    }

    @Override
    public boolean esVegetariano() {
        return esVegetariano;
    }
    

    @Override
    public void ponerMayonesa() {
        
    }

    @Override
    public void ponerCarne() {
        
    }

    @Override
    public void ponerQueso() {

    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\n"
            + "Nombre: " + this.nombre + "\n"
            + "Descripcion: " + this.descripcion + "\n"
            + "Precio: $" + this.precio.toString() + "\n"
            + (tieneQueso ? "CON QUESO" + "\n" : "")
            + (esVegetariano ? "PLATILLO VEGETARIANO" + "\n" : "") + "\n";
    }
}
