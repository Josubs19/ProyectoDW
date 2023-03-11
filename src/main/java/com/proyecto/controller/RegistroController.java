
package com.proyecto.controller;

import com.proyecto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroController {
    
    
	@GetMapping("/log")
	public String iniciarSesion() {
		return "log";
	}
        
        @GetMapping("/index")
	public String verPaginaDeInicio() {
		return "index";
	}
	
	
}
