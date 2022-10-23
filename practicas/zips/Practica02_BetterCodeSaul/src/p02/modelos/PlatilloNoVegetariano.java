package p02.modelos;

import java.math.BigDecimal;
import static p02.util.Printer.*;

/**
 * Clase que representa un platillo que lleva carne y puede o no llevar queso.
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class PlatilloNoVegetariano extends Platillo {
    
    protected Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Boolean tieneQueso = true;
    private final Boolean esVegetariano = false;
    
    public PlatilloNoVegetariano() {
        super(null);
    }

    public PlatilloNoVegetariano(
            Long id,
            String nombre,
            String descripcion, 
            BigDecimal precio,
            Boolean tieneQueso) {
        super(id);
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
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
        warning("UNTANDO LA MAYONESA");
    }

    @Override
    public void ponerCarne() {
        warning("PONIENDOLE LA CARNE");
    }

    @Override
    public void ponerQueso() {
        warning("PONIENDOLE EL QUESO");
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
