package com.bettercodesaul.repositorio;

import com.bettercodesaul.modelos.Componente;
import com.bettercodesaul.modelos.armas.*;
import com.bettercodesaul.modelos.blindajes.*;
import com.bettercodesaul.modelos.emblemas.*;
import java.util.Collection;
import java.util.List;

public class RepositorioComponentes implements Repositorio {
  private List<Componente> componentes;

  public RepositorioComponentes() {
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
        componentes.stream().filter(p -> primaryKey.equals(p.getId())).findFirst().orElse(null);

    // System.out.println(res.getNombre());
    try {
      return (Componente) res.clonar();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    System.out.println("ERROR");
    return null;
  }
}
