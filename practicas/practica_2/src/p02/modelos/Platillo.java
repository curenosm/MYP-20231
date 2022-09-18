package p02.modelos;

import java.math.BigDecimal;

/**
 * Clase que representa un platillo
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Platillo extends Preparacion {
    
    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Boolean tieneQueso;
    private Boolean esVegetariano;
    
    /**
     * Constructor sin parametros de la clase
     */
    public Platillo() {
        super();
    }

    /**
     * Constructor con parametros de la clase
     * @param id
     * @param nombre
     * @param descripcion
     * @param precio
     * @param tieneQueso
     * @param esVegetariano
     */
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

    /**
     * Metodo para obtener el ID del platillo
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo para modificar el valor del ID del platillo
     * @param id Nuevo valor del id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metodo para conocer el nombre del platillo
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el valor del nombre dle platillo
     * @param nombre String con el nuevo nombre del platillo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la descripcion del platillo
     * @return String
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo para modificar la descripcion del platillo
     * @param descripcion String con la nueva descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo para obtener el valor del precio del platillo
     * @return BigDecimal
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * Metodo para modificar el valor del precio del platillo
     * @param precio BIgDecimal
     */
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    /**
     * Metodo para saber si el platillo tiene queso
     * @return boolean
     */
    public Boolean tieneQueso() {
        return tieneQueso;
    }

    /**
     * Metodo para modificar el valor de si el platillo tiene queso
     * @param tieneQueso Booleano sobre si tiene queso o no
     */
    public void setTieneQueso(Boolean tieneQueso) {
        this.tieneQueso = tieneQueso;
    }

    /**
     * Metodo para saber si el platillo es vegetariano
     * @return boolean
     */
    public Boolean esVegetariano() {
        return esVegetariano;
    }
    
    /**
     * Metodo para modificar el valor que determina si el platillo es vegetariano
     * @param esVegetariano Booleano que determina si es vegetariano o no
     */
    public void setEsVegetariano(Boolean esVegetariano) {
        this.esVegetariano = esVegetariano;
    }

    /**
     * Metodo para preparar el platillo, hereda de la clase padre
     */
    public void preparar() {
        super.preparar(this);
    }

    /**
     * Representacion en cadena de la clase
     * @return String
     */
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
