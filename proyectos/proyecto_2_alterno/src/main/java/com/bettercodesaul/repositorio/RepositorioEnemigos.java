package com.bettercodesaul.repositorio;

import static com.bettercodesaul.generadores.GeneradorEnemigos.*;
import static com.bettercodesaul.util.Constantes.*;

import com.bettercodesaul.modelos.barcos.Nave;
import com.bettercodesaul.modelos.monstruos.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Clase de acceso a los datos de los enemigos
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class RepositorioEnemigos implements Repositorio<Nave> {

  private MonstruoMarino kraken = new MonstruoMarino("Kraken", 3000, 2700, 900);
  private Nave adp = new MonstruoAdapter(kraken);
  private ArrayList<Nave> enemigos = new ArrayList<>();

  private static volatile RepositorioEnemigos uniqueInstance;

  /** Constructor privado para usar Singleton */
  private RepositorioEnemigos() {
    enemigos.add(generarSubmarino());
    enemigos.add(generarAcorazado());
    enemigos.add(generarPortaAviones());
    enemigos.add(adp);
    generarEnemigos();
  }

  /**
   * Metodo que devuelve una instancia de la clase tras realizar un par de verificaciones
   *
   * @return RepositorioEnemigos
   */
  public static RepositorioEnemigos getInstance() {
    if (uniqueInstance == null) {
      synchronized (RepositorioEnemigos.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new RepositorioEnemigos();
        }
      }
    }

    return uniqueInstance;
  }

  /** Metodo que devuelve todos los enemigos registrados en el sistema */
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
  public Nave find(Long primaryKey) {
    Nave res = enemigos.stream().filter(p -> primaryKey.equals(p.getId())).findFirst().orElse(null);

    try {
      return (Nave) res.generarNave();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void generarEnemigos() {
    //  enemigos= enemigos.to
    while (enemigos.size() < 7) {
      int resp = random(0, 4);
      try {
        Nave enemy = (Nave) enemigos.get(resp).generarNave();
        this.enemigos.add(enemy);
      } catch (CloneNotSupportedException e) {
        e.printStackTrace();
      }
    }
    Collections.shuffle(enemigos);
  }

  public Iterator<Nave> getEnemigos() {
    return enemigos.iterator();
  }
}
