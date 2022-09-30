package main.java.p04.modelos.cabinas;

import java.math.BigDecimal;

/**
 *Clase que representa una cabina para una tripulacion pequenia. Extiende de la clase Cabina.
 *@author Alcantara Estrada Kevin Isaac
 *@author Curenio Sanchez Misael
 *@author Hernandez Paramo ELizabeth
 */
public class CabinaTripulacionPequena extends Cabina{

    /**
     * Metodo constructor sin parametros de la clase
     */
    public CabinaTripulacionPequena(){
        this.nombre= "Cabina Tripulacion Pequena.";
        this.descripcion= "Cabina para una tripulacion de entre 3 y 4 integrantes";
        this.precio= new BigDecimal(2345.90);
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