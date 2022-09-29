package main.java.p04.modelos.cabinas;

import java.math.BigDecimal;

public class CabinaEjercito extends Cabina{

    public CabinaEjercito(){
        this.nombre= "Cabina Ejercito.";
        this.descripcion= "Cabina creada para un ejercito extenso.";
        this.precio= new BigDecimal(4356.12);
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