package com.bettercodesaul.repositorio;

import com.bettercodesaul.modelos.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio implements Repositorio<Usuario> {

  private static volatile UsuarioRepositorio uniqueInstance;
  private List<Usuario> usuarios;

  public static UsuarioRepositorio getInstance() {

    if (uniqueInstance == null) {
      synchronized (UsuarioRepositorio.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new UsuarioRepositorio();
        }
      }
    }

    return uniqueInstance;
  }

  private UsuarioRepositorio() {
    try {
      usuarios =
          List.of(
              new Usuario(
                  "admin",
                  "admin",
                  "Admin",
                  "5511223344",
                  "Boulevard of Broken Dreams",
                  11L,
                  "es_MX"),
              new Usuario("manolo", "manolo", "Manolo", "5511111111", "Sin nombre", 12L, "es_ES"),
              new Usuario(
                  "john",
                  "john",
                  "John",
                  "5599887766",
                  "St Mary Street no. 1, Wisconsin",
                  13L,
                  "en_US"));
    } catch (Exception e) {
      usuarios = new ArrayList<>();
    }
  }

  public Usuario find(String username) {
    return this.usuarios
        .stream()
        .filter(u -> u.getUsername().equals(username))
        .findFirst()
        .orElse(null);
  }
}
