package p02.modelos;

import java.math.BigDecimal;
import static p02.util.Printer.*;

public class PlatilloNoVegetariano extends Platillo {
    
    protected Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Boolean tieneQueso = false;
    private final Boolean esVegetariano = false;
    
    public PlatilloNoVegetariano() {
        super(null);
    }

    public PlatilloNoVegetariano(
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
        success("UNTANDO LA MAYONESA");
    }

    @Override
    public void ponerCarne() {
        success("PONIENDOLE LA CARNE");
    }

    @Override
    public void ponerQueso() {
        success("PONIENDOLE EL QUESO");
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
