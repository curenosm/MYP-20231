package com.bettercodesaul.proyecto_2.controlador;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Clase controladora encargada de redireccionar las solicitudes de
 * ciertas rutas a sus vistas asociadas
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */

@Slf4j
@Controller
public class ControladorTemplates {

    @GetMapping
    public String home() {
        return "redirect:/index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }

    @GetMapping("/ranking")
    public String ranking() {
        return "ranking";
    }
    
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

    @RequestMapping("/perfil/{username}")
	public String perfil(@PathVariable String username, Model model) {

        model.addAttribute("username", username);
        return "perfil";
	}

	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
}
