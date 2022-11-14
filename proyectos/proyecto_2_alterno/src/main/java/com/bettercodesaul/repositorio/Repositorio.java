package com.bettercodesaul.repositorio;

import java.util.Collection;

/**
 * Interfaz que simula un repositorio
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public interface Repositorio<T> {

  public T find(Long primaryKey);

  public Collection<T> findAll();
}
