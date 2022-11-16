package com.bettercodesaul;

import static com.bettercodesaul.util.Printer.*;
import static com.bettercodesaul.util.PropertiesFactory.*;

import com.bettercodesaul.controladores.ControladorBuilder;
import com.bettercodesaul.controladores.ControladorJuego;
import com.bettercodesaul.generadores.GeneradorComponentes;
import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.util.*;
import java.util.Scanner;

/**
 * Clase para correr el resto del proyecto e interactuar con el usuario
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Main {

  private static Scanner scanner = new Scanner(System.in);
  private static int contador;
  private static GeneradorComponentes gen = new GeneradorComponentes();
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
