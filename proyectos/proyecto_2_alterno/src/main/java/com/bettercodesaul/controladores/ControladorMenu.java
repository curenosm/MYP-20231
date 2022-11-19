package com.bettercodesaul.controladores;

import static com.bettercodesaul.util.WriteFile.*;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.modelos.powerups.PowerUp;
import com.bettercodesaul.repositorio.RepositorioComponentes;
import com.bettercodesaul.repositorio.RepositorioPowerUps;
import com.bettercodesaul.vistas.VistaMenu;
import java.util.Scanner;

/**
 * Controlador para armar las naves
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class ControladorMenu {

  private RepositorioComponentes repoCom;
  private RepositorioPowerUps repoPow;
  private Scanner scanner;
  private ControladorJuego cJuego;
  private ControladorBuilder cBuilder;
  private VistaMenu vistaMenu;

  public ControladorMenu() {
    repoCom = RepositorioComponentes.getInstance();
    repoPow = RepositorioPowerUps.getInstance();
    cBuilder = new ControladorBuilder();
    vistaMenu = VistaMenu.getInstance();
    scanner = new Scanner(System.in);
  }

  /**
   * Metodo que nos muestra todos los componentes disponibles
   */
  public void listaComponentes() {
    String s = "";
    for (Componente comp : repoCom.findAll()) {
      s += comp.toString();
      s += "\n";
    }
    String direc = "data_componentes.txt";
    writeUsingFiles(direc, s);
  }


  /**
   * Metodo que nos muestra todos los powerups disponibles
   */ 
  public void listaPowerUps() {
    String s = "";
    for (PowerUp power : repoPow.findAll()) {
      s += power.nombre() + "\n" + power.descripcion();
      s += "\n\n";
    }
    String direc = "data_powerups.txt";
    writeUsingFiles(direc, s);
  }

  /**
   * Metodo que maneja las opciones relacionadas al menu del juego
   */
  public void menu() {
    int resp = 0;
    vistaMenu.saludo();
    do {
      vistaMenu.menu();
      try {
        resp = scanner.nextInt();

        switch (resp) {
          case 1:
            listaComponentes();
            vistaMenu.generado();
            break;
          case 2:
            listaPowerUps();
            vistaMenu.generado();
            break;
          case 3:
            listaComponentes();
            listaPowerUps();
            Nave nave = cBuilder.construirNave();
            cJuego = new ControladorJuego(nave);
            cJuego.jugar();
            break;
          case 4:
            System.exit(0);
            break;

          default:
            throw new Exception();
        }
      } catch (Exception e) {
        vistaMenu.opcionInvalida();
        resp = 0;
        scanner = new Scanner(System.in);
        e.printStackTrace();
      }
    } while (true);
  }
}
