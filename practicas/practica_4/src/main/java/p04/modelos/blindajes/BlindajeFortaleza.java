package main.java.p04.modelos.blindajes;

import java.math.BigDecimal;

public class BlindajeFortaleza extends Blindaje{

    public BlindajeFortaleza(){
        this.nombre= "Blindaje Fortaleza.";
        this.descripcion= "Blindaje hecho con una aleacion de beskar y neuranio, cuenta con campos electromagneticos que rodean la aleacion.";
        this.precio= new BigDecimal(14342.77);
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
