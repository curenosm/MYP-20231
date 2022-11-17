package com.bettercodesaul.repositorio;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.armas.*;
import com.bettercodesaul.modelos.blindajes.*;
import com.bettercodesaul.modelos.emblemas.*;
import java.util.Collection;
import java.util.List;

public class RepositorioComponentes implements Repositorio<Componente> {

  private static volatile RepositorioComponentes uniqueInstance;
  private List<Componente> componentes;

  /** Constructor privado para usar Singleton */
  private RepositorioComponentes() {
    this.componentes =
        List.of(
            new CanionSimple(),
            new CanionDoble(),
            new CanionNuclear(),
            new BlindajeAcorazado(),
            new BlindajeMilitar(),
            new BlindajeFurtivo(),
            new CC(),
            new Actuaria(),
            new Fisica());
  }

  /**
   * Metodo que devuelve una instancia de la clase tras realizar un par de verificaciones
   *
   * @return RepositorioEnemigos
   */
  public static RepositorioComponentes getInstance() {
    if (uniqueInstance == null) {
      synchronized (RepositorioComponentes.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new RepositorioComponentes();
        }
      }
    }

    return uniqueInstance;
  }

  @Override
  public Collection<Componente> findAll() {
    return componentes;
  }

  /**
   * Metodo para encontrar un producto segun una clave dada
   *
   * @param primaryKey clave con la cual se buscara el producto
   * @return Producto
   */
  @Override
  public Componente find(Long primaryKey) {
    Componente res =
        componentes
            .stream()
            .map(
                o -> {
                  System.out.println(o);
                  return o;
                })
            .filter(p -> primaryKey.equals(p.getId()))
            .findFirst()
            .orElse(null);

    try {
      return (Componente) res.clonar();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    System.out.println("ERROR");
    return null;
  }
}
