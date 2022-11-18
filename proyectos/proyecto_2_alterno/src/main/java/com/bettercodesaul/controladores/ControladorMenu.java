package com.bettercodesaul.controladores;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;
import static com.bettercodesaul.util.WriteFile.*;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.modelos.powerups.PowerUp;
import com.bettercodesaul.repositorio.RepositorioComponentes;
import com.bettercodesaul.repositorio.RepositorioPowerUps;
import java.util.Scanner;

public class ControladorMenu {
  private RepositorioComponentes repoCom;
  private RepositorioPowerUps repoPow;
  private Scanner scanner;
  private ControladorJuego cJuego;
  private ControladorBuilder cBuilder;

  public ControladorMenu() {
    repoCom = RepositorioComponentes.getInstance();
    repoPow = RepositorioPowerUps.getInstance();
    scanner = new Scanner(System.in);
  }

  public void listaComponentes() {
    String s = "";
    for (Componente comp : repoCom.findAll()) {
      s += comp.toString();
      s += "\n";
    }
    String direc = "../util/.Componentes.txt";
    writeUsingFiles(direc, s);
  }

  public void listaPowerUps() {
    String s = "";
    for (PowerUp power : repoPow.findAll()) {
      s += power.nombre() + "\n" + power.descripcion();
      s += "\n";
    }
    String direc = "./src";
    writeUsingFiles(direc, s);
  }

  public void menu() {
    int resp = 0;
    success(property("menu"));
    do {
      try {
        resp = scanner.nextInt();

        switch (resp) {
          case 1:
            // Generar lista de componentes
            listaComponentes();
            break;

          case 2:
            // Generar lista de PowerUps
            listaPowerUps();
            break;

          case 3:
            // Jugar
            Nave nave = cBuilder.construirNave();
            cJuego = new ControladorJuego(nave);
            cJuego.jugar();
            break;

          case 4:
            // Salir
            System.exit(0);
            break;

          default:
            throw new Exception();
        }
      } catch (Exception e) {
        resp = 0;
        scanner = new Scanner(System.in);
      }
    } while (true);
  }
}
