package com.bettercodesaul.proyecto_2.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bettercodesaul.proyecto_2.repositorio.UserRepository;


/**
 * Implementacion de la interfaz UserDetailsService, nos permite acceder
 * a los usuarios de manera eficiente para temas de autenticacion y autorizacion
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final com.bettercodesaul.proyecto_2.modelo.User curUser = userRepository.findByUsername(username).orElse(null);
        if (curUser == null) {
            throw new UsernameNotFoundException(username);
        }
        
        UserDetails user = User.withUsername(curUser.getUsername())
            .password(curUser.getPassword())
            .authorities(curUser.getRoles())
            .build();
        
        return user;
    }
}
