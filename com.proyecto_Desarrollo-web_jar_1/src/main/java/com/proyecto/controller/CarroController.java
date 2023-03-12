package com.proyecto.controller;

import com.proyecto.domain.Carro;
import com.proyecto.service.CarroService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j

public class CarroController {
    @Autowired
    private CarroService carroService;
    
    
    @GetMapping("/")
    public String inicio(Model model){
        var carro = carroService.getCarro();
        model.addAttribute("carro", carro);
        return "index";
    }
    
    @GetMapping("/carro/nuevo")
    public String carroNuevo(Carro carro, Model model){
        return "modificaCarro";
    }
    @PostMapping("/carro/guardar")
    public String carroGuardar(Carro carro){
        carroService.save(carro);
        return "redirect:/";
    }
    
    @GetMapping("/carro/eliminar/{idCarro}")
    public String carroEliminar(Carro carro){
        carroService.delete(carro);
        return "redirect:/";
    }
    
    @GetMapping("carro/modificar/{idCarro}")
    public String carroModificar(Carro carro, Model model){
        carro = carroService.getCarro(carro);
        model.addAttribute("carro", carro);
        return "modificaCarro";
    }
    
}
