package com.bettercodesaul.proyecto_2.repositorio;

import com.bettercodesaul.proyecto_2.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RepositorioUsuario extends CrudRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
    List<Usuario> findAll();
}
