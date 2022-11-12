package com.bettercodesaul.proyecto_2.dto;

import com.bettercodesaul.proyecto_2.modelo.Ranking;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


/**
 * Data Transfer Object usado para modelar la respuesta de la informacion
 * necesaria para los perfiles de usuario.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Getter
@Setter
@Builder
public class DTOUsuario {
    private Long id;
    private String username;
    private List<Ranking> historialPuntuaciones;
    private String email;
}
