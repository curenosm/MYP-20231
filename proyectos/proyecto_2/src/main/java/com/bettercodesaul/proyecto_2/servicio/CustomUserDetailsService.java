package com.bettercodesaul.proyecto_2.servicio;

import com.bettercodesaul.proyecto_2.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bettercodesaul.proyecto_2.repositorio.RepositorioUsuarios;


/**
 * Implementacion de la interfaz UserDetailsService, nos permite acceder
 * a los usuarios de manera eficiente para temas de autenticacion y autorizacion
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final RepositorioUsuarios repositorioUsuarios;

    /**
     * Metodo constructor con parametros de la clase
     * @param repositorioUsuarios Instancia de la clase RepositorioUsuarios
     */
    @Autowired
    public CustomUserDetailsService(RepositorioUsuarios repositorioUsuarios) {
        this.repositorioUsuarios = repositorioUsuarios;
    }

    /**
     * Metodo para cargar los datos de un usuario de acuerdo a su nombre
     * @param username Nombre del usuario para buscarlo y cargar sus datos
     * @return UserDetails
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Usuario curUsuario = repositorioUsuarios.findByUsername(username).orElse(null);
        if (curUsuario == null) {
            throw new UsernameNotFoundException(username);
        }
        
        UserDetails user = User.withUsername(curUsuario.getUsername())
            .password(curUsuario.getPassword())
            .authorities(curUsuario.getRoles())
            .build();
        
        return user;
    }
}
