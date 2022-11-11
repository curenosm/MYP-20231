package com.bettercodesaul.proyecto_2.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Clase 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Controller
public class TemplatesController {

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

    @RequestMapping("/perfil")
	public String perfil() {
		return "perfil";
	}

	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
}
