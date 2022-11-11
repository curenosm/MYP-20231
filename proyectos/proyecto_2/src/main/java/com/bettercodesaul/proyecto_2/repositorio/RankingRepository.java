package com.bettercodesaul.proyecto_2.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bettercodesaul.proyecto_2.modelo.Ranking;
import com.bettercodesaul.proyecto_2.modelo.User;


/**
 * Interfaz que nos ayuda a acceder a la base de datos usando hibernate 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public interface RankingRepository extends CrudRepository<Ranking, Long> {
    List<Ranking> findAll();
    List<Ranking> findByUser(User user);
}
