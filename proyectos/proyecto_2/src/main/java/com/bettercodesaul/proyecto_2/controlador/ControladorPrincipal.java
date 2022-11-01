package com.bettercodesaul.proyecto_2.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorPrincipal {

    @GetMapping
    public String home() {
        return "index";
    }
}