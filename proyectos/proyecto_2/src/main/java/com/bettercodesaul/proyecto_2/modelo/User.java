package com.bettercodesaul.proyecto_2.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String username;
    
    @NotEmpty
    private String password;

    private boolean active;

    @Email
    private String email;

    private String roles;

}
