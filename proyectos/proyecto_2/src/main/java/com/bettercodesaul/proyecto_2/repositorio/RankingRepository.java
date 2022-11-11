package com.bettercodesaul.proyecto_2.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bettercodesaul.proyecto_2.modelo.Ranking;
import com.bettercodesaul.proyecto_2.modelo.User;

public interface RankingRepository extends CrudRepository<Ranking, Long> {
    List<Ranking> findAll();
    List<Ranking> findByUser(User user);
}
