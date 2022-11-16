package com.bettercodesaul;

import com.bettercodesaul.controladores.ControladorBuilder;
import com.bettercodesaul.controladores.ControladorJuego;
import com.bettercodesaul.modelos.barcos.Nave;

/**
 * Clase para correr el resto del proyecto e interactuar con el usuario
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Main {

  private static ControladorBuilder controlBuilder = new ControladorBuilder();
  private static ControladorJuego controlJuego;

  public static void main(String[] args) throws Exception {

    System.out.println("Bienvenido");
    Nave nave = controlBuilder.construirNave();
    System.out.println(nave.toString());
    controlJuego = new ControladorJuego(nave);
    controlJuego.jugar();
  }
}
