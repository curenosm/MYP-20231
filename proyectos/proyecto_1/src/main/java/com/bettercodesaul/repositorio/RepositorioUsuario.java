package com.bettercodesaul.repositorio;

import com.bettercodesaul.modelos.Usuario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Clase que simula un repositorio de usuarios. Implementa la interfaz Repositorio 
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class RepositorioUsuario implements Repositorio<Usuario> {

  private static volatile RepositorioUsuario uniqueInstance;
  private List<Usuario> usuarios;

  /**
   * Metodo para obtener un instancia de la clase tras realizar unas verificaciones
   * @return RepositorioUsuario
   */
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

  /**
   * Constructor sin parametros de la clase
   */
  private RepositorioUsuario() {
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

  /**
   * Metodo que sobreescribe el metodo finAll de la clase padre. Devuelve todos los usuarios
   * @return Collection<Usuario>
   */
  @Override
  public Collection<Usuario> findAll() {
    return usuarios;
  }

  /**
   * Metodo que busca a un usuario dentro del repositorio a partir de un parametro dado
   * @param primaryKey dato del tipo Long con el cual se buscara al usuario
   * @return Usuario
   */
  @Override
  public Usuario find(Long primaryKey) {
    return usuarios.stream().filter(u -> u.getId() == primaryKey).findFirst().orElse(null);
  }

  /**
   * Metodo para buscar y encontrar (si existe) a un usuario segun su nombre de usuario
   * @param username Nombre del usuario con el cual buscarlo
   * @return Usuario
   */
  public Usuario findByUsername(String username) {
    return usuarios.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(null);
  }
}
