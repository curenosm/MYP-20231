package main.java.p04.modelos.armas;

import java.math.BigDecimal;

public class ArmaLaserDestructorDePlanetas extends Arma{

    public ArmaLaserDestructorDePlanetas(){
        this.precio = new BigDecimal(12500.83);
        this.descripcion= "Arma con cuatro caniones cuanticos que implementan cristales kyber para generar un solo rayo con el poder para destruir planetas.";
        this.nombre= "Arma Laser Destructor de Planetas.";
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
