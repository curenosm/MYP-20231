package com.bettercodesaul.modelos.powerUps;
import com.bettercodesaul.modelos.barcos.Nave;

public class Propulsar{

    public Propulsar(){}

    public String descripcion(){
        return "Propulsas tu barco, aumentando en 2 puntos su velocidad y un 1 punto su agilidad";
    }

    public void comportamientoAtaque(Nave barco){
       
    }

    public void comportamientoDefensa(Nave barco){
        barco.setVelocidad(barco.getVelocidad()+2);
        barco.setAgilidad(barco.getAgilidad()+1);
    }

}