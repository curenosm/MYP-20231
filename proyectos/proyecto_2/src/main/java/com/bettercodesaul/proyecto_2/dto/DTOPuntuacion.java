package com.bettercodesaul.proyecto_2.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Data Transfer Object usado para modelar la respuesta de la informacion
 * necesaria para los rankings
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Builder
@Getter
@Setter
public class DTOPuntuacion {
    private Long userId;
    private String username;
    private String email;
    private Long score;
    private Date eventDate;
}
