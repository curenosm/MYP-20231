package com.bettercodesaul.repositorio;

import static com.bettercodesaul.modelos.generadores.GeneradorEnemigos.*;

import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.modelos.monstruos.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RepositorioEnemigos implements Repositorio {
  private static List<Nave> enemigos =
      List.of(
          generarSubmarino(),
          generarAcorazado(),
          generarPortaAviones(),
          new MonstruoAdapter(new MonstruoMarino("Kraken", 4500, 2700, 900)));

  public RepositorioEnemigos() {
    generarEnemigos();
  }

  @Override
  public Collection<Nave> findAll() {
    return enemigos;
  }

  /**
   * Metodo para encontrar un producto segun una clave dada
   *
   * @param primaryKey clave con la cual se buscara el producto
   * @return Producto
   */
  @Override
  public Nave find(String primaryKey) {
    Nave res =
        enemigos.stream().filter(p -> primaryKey.equals(p.getTipo())).findFirst().orElse(null);

    try {
      return (Nave) res.generarNave();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void generarEnemigos() {
    Random r = new Random();
    while (enemigos.size() < 10) {
      int resp = r.nextInt(4);
      try {
        enemigos.add((Nave) enemigos.get(resp).generarNave());
      } catch (CloneNotSupportedException e) {
        e.printStackTrace();
      }
    }
    Collections.shuffle(enemigos);
  }

  public static Iterator getEnemigos() {
    return enemigos.iterator();
  }
}
