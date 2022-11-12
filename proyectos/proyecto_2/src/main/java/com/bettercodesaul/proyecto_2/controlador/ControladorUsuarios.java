package com.bettercodesaul.proyecto_2.controlador;

import com.bettercodesaul.proyecto_2.dto.UserDTO;
import com.bettercodesaul.proyecto_2.modelo.Usuario;

import com.bettercodesaul.proyecto_2.repositorio.RepositorioUsuarios;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * Clase controladora encargada de manejar todo lo relacionado con los usuarios 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Slf4j
@RestController
@RequestMapping("/usuarios")
public class ControladorUsuarios {

    private RepositorioUsuarios repositorioUsuario;

    @Autowired
    public ControladorUsuarios(RepositorioUsuarios repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    @GetMapping
    public List<Usuario> findAll() {
        return repositorioUsuario.findAll();
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserDTO> findByUsername(@PathVariable String username) {

        Usuario usuario = repositorioUsuario.findByUsername(username).orElse(null);

        if (usuario != null)
            return ResponseEntity.ok(
                UserDTO.builder()
                    .id(usuario.getId())
                    .username(usuario.getUsername())
                    .email(usuario.getEmail())
                    .historialPuntuaciones(usuario.getHistorialPartidas())
                    .build()
            );

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Usuario save(@Valid Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

}
