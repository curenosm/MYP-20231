package com.bettercodesaul.proyecto_2.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Modelo de una bala en el juego
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Entity
@Getter
@Setter
public class Bala {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}