package com.bettercodesaul.repositorio;

import com.bettercodesaul.interfaces.Sujeto;
import com.bettercodesaul.modelos.Oferta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RepositorioOferta implements Repositorio<Oferta>, Sujeto {

  private static volatile RepositorioOferta uniqueInstance;
  private RepositorioUsuario repositorioUsuario;
  private List<Oferta> ofertas;

  public static RepositorioOferta getInstance() {
    if (uniqueInstance == null) {
      synchronized (RepositorioUsuario.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new RepositorioOferta();
        }
      }
    }

    return uniqueInstance;
  }

  private RepositorioOferta() {
    ofertas = new ArrayList<>();
    repositorioUsuario = RepositorioUsuario.getInstance();
  }

  public void save(Oferta oferta) {
    ofertas.add(oferta);
    notificar(oferta);
  }

  @Override
  public Oferta find(Long primaryKey) {
    return null;
  }

  @Override
  public Collection<Oferta> findAll() {
    return ofertas;
  }

  @Override
  public void notificar(Object oferta) {

    if (oferta instanceof Oferta) {
      Oferta res = (Oferta) oferta;

      repositorioUsuario
          .findAll()
          .stream()
          .filter(u -> u.getCodigoPais().equals(res.getCodigoPaisOferta()))
          .forEach(
              u -> {
                u.actualizar(oferta);
              });
      ;
    }
  }
}
