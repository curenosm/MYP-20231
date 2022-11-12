package com.bettercodesaul.proyecto_2.dto;

import com.bettercodesaul.proyecto_2.modelo.Ranking;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class UserDTO {
    private Long id;
    private String username;
    private List<Ranking> historialPuntuaciones;
    private String email;
}
