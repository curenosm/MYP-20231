package com.bettercodesaul.proyecto_2.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bettercodesaul.proyecto_2.modelo.Nave;
import com.bettercodesaul.proyecto_2.repositorio.NavesRepository;


/**
 * Modelo de una nave 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@RestController
@RequestMapping("/naves")
public class NavesController {

    @Autowired
    private NavesRepository navesRepository;

    @GetMapping
    public List<Nave> findAll() {
        return navesRepository.findAll(); 
    }

}