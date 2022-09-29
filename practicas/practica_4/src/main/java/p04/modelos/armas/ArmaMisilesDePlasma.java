package main.java.p04.modelos.armas;

import java.math.BigDecimal;

public class ArmaMisilesDePlasma extends Arma{

    public ArmaMisilesDePlasma(){
        this.precio= new BigDecimal(4827.63);
        this.descripcion= "Arma que arroja tandas de 4 misiles de plasma que rastrean y persiguen al objetivo designado.";
        this.nombre= "Arma Misiles de Plasma.";
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

}
