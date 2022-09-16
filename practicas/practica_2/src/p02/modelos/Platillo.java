package p02.modelos;

import java.math.BigDecimal;

public class Platillo extends Preparacion {
    
    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Boolean tieneQueso;
    private Boolean esVegetariano;

    
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
    public Boolean getTieneQueso() {
        return tieneQueso;
    }
    public void setTieneQueso(Boolean tieneQueso) {
        this.tieneQueso = tieneQueso;
    }
    public Boolean getEsVegetariano() {
        return esVegetariano;
    }
    public void setEsVegetariano(Boolean esVegetariano) {
        this.esVegetariano = esVegetariano;
    }

    

}
