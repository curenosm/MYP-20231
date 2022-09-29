package main.java.p04.modelos.blindajes;

import java.math.BigDecimal;

public class BlindajeSimple extends Blindaje{

    @Override 
    public String nombre(){
        return "Blindaje Simple.";
    }

    @Override
    public String descripcion(){
        return "Blindaje ligero hecho con acero. Resulta ligero y sutil.";
    }

    @Override 
    public BigDecimal precio(){
        BigDecimal bd = new BigDecimal(1111.11);
        return bd;
    }
}
