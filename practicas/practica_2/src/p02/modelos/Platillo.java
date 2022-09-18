package p02.modelos;

import java.math.BigDecimal;

public class Platillo extends Preparacion {
    
    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Boolean tieneQueso;
    private Boolean esVegetariano;
    
    public Platillo() {
        super();
    }

    public Platillo(Long id,
        String nombre,
        String descripcion, 
        BigDecimal precio,
        Boolean tieneQueso,
        Boolean esVegetariano) {

            super();
            this.id = id;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
            this.tieneQueso = tieneQueso;
            this.esVegetariano = esVegetariano;
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean tieneQueso() {
        return tieneQueso;
    }

    public void setTieneQueso(Boolean tieneQueso) {
        this.tieneQueso = tieneQueso;
    }

    public Boolean esVegetariano() {
        return esVegetariano;
    }
    
    public void setEsVegetariano(Boolean esVegetariano) {
        this.esVegetariano = esVegetariano;
    }

    public void preparar() {
        super.preparar(this);
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
