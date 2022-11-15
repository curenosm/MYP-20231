package com.bettercodesaul.proyecto_2.controlador;

import java.util.EventListener;
import java.awt.*;    
import java.awt.event.*;   
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bettercodesaul.proyecto_2.modelo.Nave;
import com.bettercodesaul.proyecto_2.repositorio.RepositorioNaves;


/**
 * Modelo de una nave 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@RestController
@RequestMapping("/naves")
public class ControladorNaves implements KeyListener {

    private final RepositorioNaves repositorioNaves;

    /**
     * Constructor con parametros de la clase
     * @param repositorioNaves Instancia de la clase repositorioNaves
     */
    @Autowired
    public ControladorNaves(RepositorioNaves repositorioNaves) {
        this.repositorioNaves = repositorioNaves;
    }

    /**
     * Metodo para obtener todos los elementos del respositorioNaves en forma de lista
     * @return List<Nave>
     */
    @GetMapping
    public List<Nave> findAll() {
        return repositorioNaves.findAll();
    }

    
}