package com.bettercodesaul.proyecto_2.repositorio;

import com.bettercodesaul.proyecto_2.modelo.User;
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
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
    List<User> findAll();
}
