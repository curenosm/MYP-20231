package com.bettercodesaul.proyecto_2.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bettercodesaul.proyecto_2.modelo.Nave;

public interface NavesRepository extends CrudRepository<Nave, Long>{
    List<Nave> findAll();
}
