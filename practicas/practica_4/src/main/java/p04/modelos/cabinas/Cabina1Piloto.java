package main.java.p04.modelos.cabinas;

import java.math.BigDecimal;

/**
 *Clase que representa una cabina de un piloto. Extiende de la clase Cabina.
 *@author Alcantara Estrada Kevin Isaac
 *@author Curenio Sanchez Misael
 *@author Hernandez Paramo ELizabeth
 */
public class Cabina1Piloto extends Cabina{

    /**
     * Metodo constructor sin parametros de la clase
     */
    public Cabina1Piloto(){
        this.nombre= "Cabina un piloto.";
        this.descripcion= "Cabina para un unico piloto.";
        this.precio= new BigDecimal(845.68);
    }

     /**
     * Metodo para obtener el nombre de la clase
     * @return String
     */
    @Override 
    public String nombre(){
        return this.nombre;
    }

    /**
     * Metodo para obtener la descripcion de esta pieza
     * @return String
     */
    @Override
    public String descripcion(){
        return this.descripcion;
    }

     /**
     * Metodo que devuelve el precio del componente
     * @return BigDecimal
     */
    @Override 
    public BigDecimal precio(){
      return this.precio;
    }
}