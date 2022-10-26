package com.bettercodesaul.repositorio;

import com.bettercodesaul.modelos.Usuario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RepositorioUsuario implements Repositorio<Usuario> {

  private static volatile RepositorioUsuario uniqueInstance;
  private List<Usuario> usuarios;

  public static RepositorioUsuario getInstance() {

    if (uniqueInstance == null) {
      synchronized (RepositorioUsuario.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new RepositorioUsuario();
        }
      }
    }

    return uniqueInstance;
  }

  private RepositorioUsuario() {

    // TODO: Cargar datos de productos desde archivo .bat

    try {
      usuarios =
          List.of(
              new Usuario(
                  "admin",
                  "admin",
                  "Admin",
                  "5511223344",
                  "Boulevard of Broken Dreams",
                  1L,
                  "es_MX",
                  new BigDecimal("10000")),
              new Usuario(
                  "manolo",
                  "manolo",
                  "Manolo",
                  "5511111111",
                  "Sin nombre",
                  1L,
                  "es_ES",
                  new BigDecimal("10000")),
              new Usuario(
                  "john",
                  "john",
                  "John",
                  "5599887766",
                  "St Mary Street no. 1, Wisconsin",
                  1L,
                  "en_US",
                  new BigDecimal("10000")));
    } catch (Exception e) {
      usuarios = new ArrayList<>();
    }
  }

  @Override
  public Collection<Usuario> findAll() {
    return usuarios;
  }

  @Override
  public Usuario find(Long primaryKey) {
    return usuarios.stream().filter(u -> u.getId() == primaryKey).findFirst().orElse(null);
  }

  public Usuario findByUsername(String username) {
    return usuarios.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(null);
  }
}
