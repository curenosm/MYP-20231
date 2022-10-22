package com.bettercodesaul.repositorio;

public interface Repositorio<T> {

  public T find(String field);
}
