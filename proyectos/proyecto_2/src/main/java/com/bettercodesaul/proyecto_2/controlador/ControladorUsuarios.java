package com.bettercodesaul.proyecto_2.controlador;

import com.bettercodesaul.proyecto_2.dto.DTOUsuario;
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

    /**
     * Metodo constructor de la clase con parametros
     * @param repositorioUsuario Instancia de la clase RepositorioUsuario
     */
    @Autowired
    public ControladorUsuarios(RepositorioUsuarios repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    /**
     * Metodo para obtener todos los usuarios en forma de lista
     * @return List<Usuario>
     */
    @GetMapping
    public List<Usuario> findAll() {
        return repositorioUsuario.findAll();
    }

    /**
     * Metodo para obtener un usuario de acuerdo al nombre de usuario
     * @param username Nombre del usuario a buscar
     * @return ResponseEntity<DTOUsuario>
     */
    @GetMapping("/{username}")
    public ResponseEntity<DTOUsuario> findByUsername(@PathVariable String username) {

        Usuario usuario = repositorioUsuario.findByUsername(username).orElse(null);

        if (usuario != null)
            return ResponseEntity.ok(
                DTOUsuario.builder()
                    .id(usuario.getId())
                    .username(usuario.getUsername())
                    .email(usuario.getEmail())
                    .historialPuntuaciones(usuario.getHistorialPartidas())
                    .build()
            );

        return ResponseEntity.notFound().build();
    }

    /**
     * Metodo para guardar una instancia de la clase Usuario en el repositorio de usuarios
     * @param usuario Instancia de la clase User a guardar
     * @return Usuario
     */
    @PostMapping
    public Usuario save(@Valid Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

}
