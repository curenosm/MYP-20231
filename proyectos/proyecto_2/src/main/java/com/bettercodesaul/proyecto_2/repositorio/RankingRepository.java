package com.bettercodesaul.proyecto_2.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bettercodesaul.proyecto_2.modelo.Ranking;

public interface RankingRepository extends CrudRepository<Ranking, Long> {
    List<Ranking> findFirstTenSortByPuntuacionDesc();

    List<Ranking> findLastTenByUsernameSortByFechaDesc(String username);

}
