package com.bettercodesaul.proyecto_2.controlador;

import com.bettercodesaul.proyecto_2.modelo.User;

import com.bettercodesaul.proyecto_2.repositorio.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


/**
 * Clase 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@RestController
@RequestMapping("/usuarios")
public class UserController {

    private UserRepository repositorioUsuario;

    @Autowired
    public UserController(UserRepository repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    @GetMapping
    public List<User> findAll() {
        return repositorioUsuario.findAll();
    }

    @PostMapping
    public User save(@Valid User usuario) {
        return repositorioUsuario.save(usuario);
    }

    @PostMapping("/login")
    public User login(String username, String password) {

        Optional<User> res = repositorioUsuario.findByUsername(username);

        if (!res.isEmpty()) {
            if (!res.get().getPassword().equals(password)) {
                return null;
            }
        }

        return res.get();
    }

}
