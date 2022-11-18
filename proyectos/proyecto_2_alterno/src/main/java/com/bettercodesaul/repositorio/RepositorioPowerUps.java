package com.bettercodesaul.repositorio;

import com.bettercodesaul.modelos.powerups.*;
import java.util.Collection;
import java.util.List;

public class RepositorioPowerUps implements Repositorio {
  private List<PowerUp> powerUps;
  private static volatile RepositorioPowerUps uniqueInstance;

  private RepositorioPowerUps() {
    this.powerUps =
        List.of(
            new Aviones(),
            new Blindar(),
            new Bombarderos(),
            new Cazas(),
            new Propulsar(),
            new Radar(),
            new Reforzar(),
            new Reparar(),
            new Sumergir());
  }

  public static RepositorioPowerUps getInstance() {
    if (uniqueInstance == null) {
      synchronized (RepositorioPowerUps.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new RepositorioPowerUps();
        }
      }
    }

    return uniqueInstance;
  }

  @Override
  public Collection<PowerUp> findAll() {
    return powerUps;
  }

  /**
   * Metodo para encontrar un producto segun una clave dada
   *
   * @param primaryKey clave con la cual se buscara el producto
   * @return Producto
   */
  @Override
  public PowerUp find(Long primaryKey) {
    int index = primaryKey.intValue();
    return powerUps.get(index);
  }
}
