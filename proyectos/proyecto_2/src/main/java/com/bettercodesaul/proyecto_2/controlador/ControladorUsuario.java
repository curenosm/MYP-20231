package com.bettercodesaul.proyecto_2.controlador;

import com.bettercodesaul.proyecto_2.modelo.Usuario;
import com.bettercodesaul.proyecto_2.repositorio.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class ControladorUsuario {

    private RepositorioUsuario repositorioUsuario;

    @GetMapping
    public List<Usuario> findAll() {
        return repositorioUsuario.findAll();
    }

    @PostMapping
    public Usuario save(@Valid Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    @PostMapping("/login")
    public Usuario login(String username, String password) {

        Optional<Usuario> res = repositorioUsuario.findByUsername(username);

        if (!res.isEmpty()) {
            if (!res.get().getPassword().equals(password)) {
                return null;
            }
        }

        return res.get();
    }

}
