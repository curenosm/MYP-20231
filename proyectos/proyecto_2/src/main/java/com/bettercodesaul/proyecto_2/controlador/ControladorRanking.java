package com.bettercodesaul.proyecto_2.controlador;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.bettercodesaul.proyecto_2.dto.DTOPuntuacion;
import com.bettercodesaul.proyecto_2.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bettercodesaul.proyecto_2.modelo.Ranking;
import com.bettercodesaul.proyecto_2.repositorio.RepositorioRanking;
import com.bettercodesaul.proyecto_2.repositorio.RepositorioUsuarios;

import lombok.extern.slf4j.Slf4j;

/**
 * Clase
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Slf4j
@RestController
@RequestMapping("/puntuaciones")
public class ControladorRanking {

    private RepositorioRanking repositorioRanking;
    private RepositorioUsuarios repositorioUsuarios;

    @Autowired
    public ControladorRanking(RepositorioRanking repositorioRanking, RepositorioUsuarios repositorioUsuarios) {
        this.repositorioRanking = repositorioRanking;
        this.repositorioUsuarios = repositorioUsuarios;
    }

    @GetMapping("/top")
    public List<DTOPuntuacion> findTopRanking() {

        List<DTOPuntuacion> res = this.repositorioRanking
                .findAll()
                .stream()
                .sorted( (r1, r2) -> r1.getPuntuacion().compareTo(r2.getPuntuacion()))
                .map(r -> {

                    if (r.getUsuario() != null)
                        return DTOPuntuacion.builder()
                            .email(r.getUsuario().getEmail())
                            .score(r.getPuntuacion())
                            .userId(r.getUsuario().getId())
                            .username(r.getUsuario().getUsername())
                            .eventDate(r.getFecha())
                                .build();

                    return null;
                })
                .collect(Collectors.toList());

        return res;
    }

    @GetMapping("/history")
    public List<Ranking> findUserHistory(@AuthenticationPrincipal User user) {
        Usuario cur = repositorioUsuarios.findByUsername(user.getUsername())
                .orElse(null);

        return this.repositorioRanking.findByUsuario(cur);
    }

    @PostMapping
    public Ranking save(@AuthenticationPrincipal User user, @Valid @RequestBody Ranking ranking) {

        try {

            if(user != null){
                log.info(user.getUsername());
                log.info(user.toString());
            }
            

            Usuario cur = repositorioUsuarios.findByUsername(user.getUsername())
                    .orElse(null);

            ranking.setUsuario(cur);
            ranking.setFecha(Date.from(Instant.now()));

            log.info(ranking.getPuntuacion().toString());

            if (user != null)
                log.info(user.toString());

            if (ranking != null)
                log.info(ranking.toString());

            log.info("Hola si se esta guardando");

            return this.repositorioRanking.save(ranking);
        } catch (Exception e) {
            e.printStackTrace();
            log.info(e.getMessage());
        }

        return null;

    }

}
