package main.java.p04.modelos.cabinas;

import java.math.BigDecimal;

import main.java.p04.modelos.sistemas.SistemaDePropulsion;

public class ViajeInterplanetario extends SistemaDePropulsion{

    public ViajeInterplanetario(){
        this.nombre= "Viaje Interplanetario.";
        this.descripcion= "Sistema de propulsion que permite viajar entre planetas de una misma galaxia";
        this.precio= new BigDecimal(2765.97);
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