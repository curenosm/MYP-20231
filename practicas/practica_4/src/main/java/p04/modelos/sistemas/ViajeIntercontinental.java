package main.java.p04.modelos.sistemas;

import java.math.BigDecimal;

/**
 *Clase que representa un sistema de propulsion para viajes intercontinentales. Extiende de la clase SistemaDePropulsion.
 *@author Alcantara Estrada Kevin Isaac
 *@author Curenio Sanchez Misael
 *@author Hernandez Paramo ELizabeth
 */
public class ViajeIntercontinenal extends SistemaDePropulsion{

    /**
     * Metodo constructor sin parametros de la clase
     */
    public ViajeIntercontinenal(){
        this.nombre= "Viaje Intercontinental.";
        this.descripcion= "Sistema de propulsion que permite viajar entre continentes dentro de un mismo planeta";
        this.precio= new BigDecimal(977.43);
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