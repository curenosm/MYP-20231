package main.java.p04.modelos.cabinas;

import java.math.BigDecimal;

import main.java.p04.modelos.sistemas.SistemaDePropulsion;

public class ViajeIntergalactico extends SistemaDePropulsion{

    public ViajeIntergalactico(){
        this.nombre= "Viaje Intergalactico.";
        this.descripcion= "Sistema de propulsion que permite desplazarse a otras galaxias";
        this.precio= new BigDecimal(9914.89);
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