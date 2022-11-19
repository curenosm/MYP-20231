package com.bettercodesaul;

import com.bettercodesaul.controladores.ControladorBuilder;
import com.bettercodesaul.controladores.ControladorJuego;
import com.bettercodesaul.controladores.ControladorMenu;

/**
 * Clase para correr el resto del proyecto e interactuar con el usuario
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class Main {

  private static ControladorBuilder controladorBuilder = new ControladorBuilder();
  private static ControladorMenu controladorMenu = new ControladorMenu();
  private static ControladorJuego controladorJuego;

  public static void main(String[] args) throws Exception {

    controladorMenu.menu();
  }
}
