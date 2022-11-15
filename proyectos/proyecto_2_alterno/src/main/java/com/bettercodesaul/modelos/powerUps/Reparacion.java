package com.bettercodesaul.modelos.powerUps;
import com.bettercodesaul.modelos.barcos.Nave;

public class Reparacion{

    public Reparacion(){}

    public String descripcion(){
        return "Cedes por un momento para reparar danios, aumentando tu vida en 1000 puntos";
    }

    public void comportamientoAtaque(Nave barco){
       
    }

    public void comportamientoDefensa(Nave barco){
        int aumento = barco.getVida+ 1000;
        barco.setBlindaje(aumento);
    }

}