package com.bettercodesaul.proyecto_2.controlador;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bettercodesaul.proyecto_2.modelo.Ranking;
import com.bettercodesaul.proyecto_2.modelo.User;
import com.bettercodesaul.proyecto_2.repositorio.RankingRepository;

@RestController
@RequestMapping("/puntuaciones")
public class RankingController {
    
    @Autowired
    private RankingRepository rankingRepository;

    @GetMapping("/top")
    public List<Ranking> findTopRanking() {
        return this.rankingRepository.findFirstTenSortByPuntuacionDesc();
    }

    @GetMapping("/history")
    public List<Ranking> findUserHistory(@AuthenticationPrincipal User user) {
        return this.rankingRepository.findLastTenByUsernameSortByFechaDesc(user.getUsername());
    }

    @PostMapping
    public Ranking save(@AuthenticationPrincipal User user, @Valid Ranking ranking) {
        ranking.setUser(user);
        ranking.setFecha(Date.from(Instant.now()));
        
        return this.rankingRepository.save(ranking);
    }


}
