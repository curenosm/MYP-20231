package main.java.p04.modelos.cabinas;

import java.math.BigDecimal;

import main.java.p04.modelos.sistemas.SistemaDePropulsion;

public class ViajeIntercontinenal extends SistemaDePropulsion{

    public ViajeIntercontinenal(){
        this.nombre= "Viaje Intercontinental.";
        this.descripcion= "Sistema de propulsion que permite viajar entre continentes dentro de un mismo planeta";
        this.precio= new BigDecimal(977.43);
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