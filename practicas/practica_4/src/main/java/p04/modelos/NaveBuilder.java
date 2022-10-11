package main.java.p04.modelos;

import main.java.p04.modelos.armas.*;
import main.java.p04.modelos.blindajes.*;
import main.java.p04.modelos.cabinas.*;
import main.java.p04.modelos.sistemas.*;

public class NaveBuilder extends Builder{
    private Nave nave;

    public NaveBuilder(){}

    public NaveBuilder(Nave nave){
        this.nave=nave;
    }
    
    public Nave getNave(){
        return this.nave;
    }

    @Override
    public Nave build(){
        this.nave= super.build();
        return this.nave;
    }
}