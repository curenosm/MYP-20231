package main.java.p04.modelos.cabinas;

import java.math.BigDecimal;

public class CabinaTripulacionPequena extends Cabina{

    public CabinaTripulacionPequena(){
        this.nombre= "Cabina Tripulacion Pequena.";
        this.descripcion= "Cabina para una tripulacion de entre 3 y 4 integrantes";
        this.precio= new BigDecimal(2345.90);
        }

    @Override 
    public String nombre(){
        return this.nombre;
    }

    @Override
    public String descripcion(){
        return this.descripcion;
    }

    @Override 
    public BigDecimal precio(){
        return this.precio;
    }
}