package main.java.p04.modelos;

import main.java.p04.modelos.armas.*;
import main.java.p04.modelos.blindajes.*;
import main.java.p04.modelos.cabinas.*;
import main.java.p04.modelos.sistemas.*;

public class Builder{

    protected Componente arma;
    protected Componente blindaje;
    protected Componente cabina;
    protected Componente sistemaDePropulsion;

    public Builder(){}

    public Builder(Componente arma, Componente blindaje, Componente cabina, Componente sistema){
        this.arma = arma;
        this.blindaje=blindaje;
        this.cabina=cabina;
        this.sistemaDePropulsion=sistema;
    }

    public Nave build(){

        return new Nave(this.arma, this.blindaje, this.cabina, this.sistemaDePropulsion);

    }

    public Builder arma(Componente arma){
        this.arma = arma;
        return this;
    }


    public Builder blindaje(Componente blindaje){
        this.blindaje = blindaje;
        return this;
    }

    public Builder cabina(Componente cabina){
        this.cabina = cabina;
        return this;
    }

    public Builder sistemaDePropulsion(Componente sistemaDePropulsion){
        this.sistemaDePropulsion = sistemaDePropulsion;
        return this;
    }
}