package main.java.p04.modelos.blindajes;

import java.math.BigDecimal;

public class BlindajeReforzado extends Blindaje{

    public BlindajeReforzado(){
        this.nombre= "Blindaje Reforzado.";
        this.descripcion= "Blindaje de 5 cm hecho de electrum y oro, capaz de resistir ataques de armas laser.";
        this.precio =  new BigDecimal(6324.58);
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
