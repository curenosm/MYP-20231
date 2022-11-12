package com.bettercodesaul.proyecto_2.repositorio;

import com.bettercodesaul.proyecto_2.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


/**
 * Interfaz que nos ayuda a acceder a la base de datos usando hibernate 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public interface RepositorioUsuarios extends CrudRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
    List<Usuario> findAll();
}
