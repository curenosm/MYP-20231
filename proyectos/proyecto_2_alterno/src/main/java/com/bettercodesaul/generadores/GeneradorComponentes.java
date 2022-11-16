package com.bettercodesaul.modelos.generadores;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.repositorio.RepositorioComponentes;
import java.util.Random;

public class GeneradorComponentes {
  private static RepositorioComponentes repositorioComponentes;

  public GeneradorComponentes() {
    repositorioComponentes = new RepositorioComponentes();
  }

  public static Componente generarArma() {
    Random r = new Random();
    int buscar = r.nextInt(3);
    switch (buscar) {
      case 0:
        return repositorioComponentes.find(001L);
      case 1:
        return repositorioComponentes.find(002L);
      case 2:
        return repositorioComponentes.find(003L);
      default:
        return null;
    }
  }

  public static Componente generarBlindaje() {
    Random r = new Random();
    int buscar = r.nextInt(3);
    switch (buscar) {
      case 0:
        return repositorioComponentes.find(010L);
      case 1:
        return repositorioComponentes.find(020L);
      case 2:
        return repositorioComponentes.find(030L);
      default:
        return null;
    }
  }

  public static Componente generarEmblema() {
    Random r = new Random();
    int buscar = r.nextInt(3);
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
