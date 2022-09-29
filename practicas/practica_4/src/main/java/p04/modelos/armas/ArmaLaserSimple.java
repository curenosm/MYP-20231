package main.java.p04.modelos.armas;

import java.math.BigDecimal;
public class ArmaLaserSimple extends Arma{

    public ArmaLaserSimple(){
        this.precio = new BigDecimal(563.21);
        this.descripcion= "Arma de un solo canion que dispara rafagas laser a gran velocidad.";
        this.nombre= "Arma Laser Simple.";
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
