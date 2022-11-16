package com.bettercodesaul.controladores;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.repositorio.RepositorioComponentes;
import como.bettercodesaul.modelos.Builder;
import java.util.Scanner;

public class ControladorBuilder {
  private Builder constructor;
  private RepositorioComponentes repo;
  private Scanner scanner = new Scanner(System.in);

  public ControladorBuilder() {
    constructor = new Builder();
    repo = new RepositorioComponentes();
  }

  public Nave construirNave() {
    constructor = constructor.tipo(elegirTipo());
    constructor = constructor.arma(elegirArma());
    constructor = constructor.blindaje(elegirBlindaje());
    constructor = constructor.emblema(elegirEmblema());
    return constructor.build();
  }

  public Componente elegirArma() {
    info(property("menu.tipo.armas"));
    int resp = 0;
    do {
      try {
        resp = scanner.nextInt();
        switch (resp) {
          case 1:
            return repo.find(001L);

          case 2:
            return repo.find(002L);

          case 3:
            return repo.find(003L);

          default:
            throw new Exception();
        }

      } catch (Exception e) {
        error(property("messages.error.invalid.option"));
        scanner = new Scanner(System.in);
      }
    } while (true);
  }

  public Componente elegirBlindaje() {
    info(property("menu.tipo.blindajes"));
    int resp = 0;
    do {
      try {
        resp = scanner.nextInt();
        switch (resp) {
          case 1:
            return repo.find(010L);

          case 2:
            return repo.find(020L);

          case 3:
            return repo.find(030L);

          default:
            throw new Exception();
        }

      } catch (Exception e) {
        error(property("messages.error.invalid.option"));
        scanner = new Scanner(System.in);
      }
    } while (true);
  }

  public Componente elegirEmblema() {
    info(property("menu.tipo.emblemas"));
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
        error(property("messages.error.invalid.option"));
        scanner = new Scanner(System.in);
      }
    } while (true);
  }

  public int elegirTipo() {
    info(property("menu.tipo.barcos"));
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
        error(property("messages.error.invalid.option"));
        scanner = new Scanner(System.in);
      }
    } while (true);
  }
}
