package com.bettercodesaul.controladores;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

import com.bettercodesaul.modelos.Builder;
import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.repositorio.RepositorioComponentes;
import java.util.Scanner;

public class ControladorBuilder {
  private Builder constructor;
  private RepositorioComponentes repo;
  private Scanner scanner = new Scanner(System.in);

  public ControladorBuilder() {
    constructor = new Builder();
    repo = RepositorioComponentes.getInstance();
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
            return repo.find(1L);

          case 2:
            return repo.find(2L);

          case 3:
            return repo.find(3L);

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
            return repo.find(10L);

          case 2:
            return repo.find(20L);

          case 3:
            return repo.find(30L);

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
