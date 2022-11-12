package com.bettercodesaul.proyecto_2.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Builder
@Getter
@Setter
public class PuntuacionDTO {
    private Long userId;
    private String username;
    private String email;
    private Long score;
    private Date eventDate;
}
