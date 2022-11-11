package com.bettercodesaul.proyecto_2.modelo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


/**
 * Clase 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(unique = true)
    private String username;
    
    @NotEmpty
    private String password;

    private boolean active;

    @Email
    @Column(unique = true)
    private String email;

    private String roles;

    @OneToMany(mappedBy = "user")
    private List<Ranking> historialPartidas;

}
