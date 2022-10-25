package com.bettercodesaul.repositorio;

import java.util.Collection;

public interface Repositorio<T> {

  public T find(Long primaryKey);

  public Collection<T> findAll();
}
