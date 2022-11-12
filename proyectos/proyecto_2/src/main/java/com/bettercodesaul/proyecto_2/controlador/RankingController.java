package com.bettercodesaul.proyecto_2.controlador;

import java.time.Instant;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bettercodesaul.proyecto_2.modelo.Ranking;
import com.bettercodesaul.proyecto_2.repositorio.RankingRepository;
import com.bettercodesaul.proyecto_2.repositorio.UserRepository;

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
public class RankingController {

    private RankingRepository rankingRepository;
    private UserRepository userRepository;

    @Autowired
    public RankingController(RankingRepository rankingRepository, UserRepository userRepository) {
        this.rankingRepository = rankingRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/top")
    public List<Ranking> findTopRanking() {
        return this.rankingRepository
                .findAll();
    }

    @GetMapping("/history")
    public List<Ranking> findUserHistory(@AuthenticationPrincipal User user) {
        com.bettercodesaul.proyecto_2.modelo.User cur = userRepository.findByUsername(user.getUsername())
                .orElse(null);

        return this.rankingRepository.findByUser(cur);
    }

    @PostMapping
    public Ranking save(@AuthenticationPrincipal User user, @Valid @RequestBody Ranking ranking) {

        try {

            if(user != null){
                log.info(user.getUsername());
                log.info(user.toString());
            }
            

            com.bettercodesaul.proyecto_2.modelo.User cur = userRepository.findByUsername(user.getUsername())
                    .orElse(null);

            ranking.setUser(cur);
            ranking.setFecha(Date.from(Instant.now()));

            log.info(ranking.getPuntuacion().toString());

            if (user != null)
                log.info(user.toString());

            if (ranking != null)
                log.info(ranking.toString());

            log.info("Hola si se esta guardando");

            return this.rankingRepository.save(ranking);
        } catch (Exception e) {
            e.printStackTrace();
            log.info(e.getMessage());
        }

        return null;

    }

}
