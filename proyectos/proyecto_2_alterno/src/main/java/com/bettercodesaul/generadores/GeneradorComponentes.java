package com.bettercodesaul.generadores;

import static com.bettercodesaul.util.Constantes.*;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.repositorio.RepositorioComponentes;

public class GeneradorComponentes {
  private static RepositorioComponentes repositorioComponentes =
      RepositorioComponentes.getInstance();;

  public static Componente generarArma() {

    int buscar = random(0, 3);
    switch (buscar) {
      case 0:
        return repositorioComponentes.find(1L);
      case 1:
        return repositorioComponentes.find(2L);
      case 2:
        return repositorioComponentes.find(3L);
      default:
        return null;
    }
  }

  public static Componente generarBlindaje() {

    int buscar = random(0, 3);
    switch (buscar) {
      case 0:
        return repositorioComponentes.find(10L);
      case 1:
        return repositorioComponentes.find(20L);
      case 2:
        return repositorioComponentes.find(30L);
      default:
        return null;
    }
  }

  public static Componente generarEmblema() {
    int buscar = random(0, 3);
    switch (buscar) {
      case 0:
        return repositorioComponentes.find(100L);
      case 1:
        return repositorioComponentes.find(200L);
      case 2:
        return repositorioComponentes.find(300L);
      default:
        return null;
    }
  }
}
