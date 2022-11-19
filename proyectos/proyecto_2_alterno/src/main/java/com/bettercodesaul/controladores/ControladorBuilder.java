package com.bettercodesaul.controladores;

import com.bettercodesaul.modelos.Builder;
import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.repositorio.RepositorioComponentes;
import com.bettercodesaul.vistas.VistaBuilder;
import java.util.Scanner;

/**
 * Controlador para armar las naves
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class ControladorBuilder {

  private Builder constructor;
  private RepositorioComponentes repo;
  private Scanner scanner = new Scanner(System.in);
  private VistaBuilder vistaBuilder;

  public ControladorBuilder() {
    constructor = new Builder();
    repo = RepositorioComponentes.getInstance();
    vistaBuilder = VistaBuilder.getInstance();
  }

  /**
   * Metodo constructor de la nave
   *
   * @return Nave construida usando los componentes elegidos
   */
  public Nave construirNave() {
    constructor = constructor.tipo(elegirTipo());
    constructor = constructor.arma(elegirArma());
    constructor = constructor.blindaje(elegirBlindaje());
    constructor = constructor.emblema(elegirEmblema());
    return constructor.build();
  }

  /**
   * Metodo para solicitar el tipo de arma
   *
   * @return tipo de nave elegida
   */
  public Componente elegirArma() {
    vistaBuilder.menuArmas();
    int resp = 0;
    do {
      try {
        resp = scanner.nextInt();
        switch (resp) {
          case 1:
            return repo.find(1L);
          case 2:
            return repo.find(2L);
          case 3:
            return repo.find(3L);
          default:
            throw new Exception();
        }

      } catch (Exception e) {
        vistaBuilder.opcionInvalida();
        scanner = new Scanner(System.in);
      }
    } while (true);
  }

  /**
   * Metodo para solicitar el tipo de blindaje
   *
   * @return tipo de nave elegida
   */
  public Componente elegirBlindaje() {
    vistaBuilder.menuBlindajes();
    int resp = 0;
    do {
      try {
        resp = scanner.nextInt();
        switch (resp) {
          case 1:
            return repo.find(10L);

          case 2:
            return repo.find(20L);

          case 3:
            return repo.find(30L);

          default:
            throw new Exception();
        }

      } catch (Exception e) {
        vistaBuilder.opcionInvalida();
        scanner = new Scanner(System.in);
      }
    } while (true);
  }

  /**
   * Metodo para solicitar el tipo de emblema
   *
   * @return tipo de nave elegida
   */
  public Componente elegirEmblema() {
    vistaBuilder.menuEmblemas();
    int resp = 0;
    do {
      try {
        resp = scanner.nextInt();
        switch (resp) {
          case 1:
            return repo.find(100L);

          case 2:
            return repo.find(200L);

          case 3:
            return repo.find(300L);

          default:
            throw new Exception();
        }

      } catch (Exception e) {
        vistaBuilder.opcionInvalida();
        scanner = new Scanner(System.in);
      }
    } while (true);
  }

  /**
   * Metodo para solicitar el tipo de nave
   *
   * @return tipo de nave elegida
   */
  public int elegirTipo() {
    vistaBuilder.menuTipo();
    int resp = 0;
    do {
      try {
        resp = scanner.nextInt();

        if (resp < 1 || resp > 3) {
          throw new Exception();
        } else {
          return resp;
        }

      } catch (Exception e) {
        vistaBuilder.opcionInvalida();
        scanner = new Scanner(System.in);
      }
    } while (true);
  }
}
