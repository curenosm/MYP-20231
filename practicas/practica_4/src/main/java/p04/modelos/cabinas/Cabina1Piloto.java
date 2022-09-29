package main.java.p04.modelos.cabinas;

import java.math.BigDecimal;

public class Cabina1Piloto extends Cabina{

    public Cabina1Piloto(){
        this.nombre= "Cabina un piloto.";
        this.descripcion= "Cabina para un unico piloto.";
        this.precio= new BigDecimal(845.68);
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