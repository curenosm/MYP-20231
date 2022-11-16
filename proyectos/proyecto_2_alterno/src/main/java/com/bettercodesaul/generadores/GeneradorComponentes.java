package com.bettercodesaul.generadores;

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
        return repositorioComponentes.find("CanionSimple");
      case 1:
        return repositorioComponentes.find("CanionDoble");
      case 2:
        return repositorioComponentes.find("CanionNuclear");
      default:
        return null;
    }
  }

  public static Componente generarBlindaje() {
    Random r = new Random();
    int buscar = r.nextInt(3);
    switch (buscar) {
      case 0:
        return repositorioComponentes.find("BlindajeReforzado");
      case 1:
        return repositorioComponentes.find("BlindajeFurtivo");
      case 2:
        return repositorioComponentes.find("BlindajeMilitar");
      default:
        return null;
    }
  }

  public static Componente generarEmblema() {
    Random r = new Random();
    int buscar = r.nextInt(3);
    switch (buscar) {
      case 0:
        return repositorioComponentes.find("CC");
      case 1:
        return repositorioComponentes.find("Actuaria");
      case 2:
        return repositorioComponentes.find("Fisica");
      default:
        return null;
    }
  }
}
