package com.proyecto.controller;

import com.proyecto.domain.Carro;
import com.proyecto.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller
@RequestMapping("/carro")

public class CarroController {
    @Autowired
    private CarroService carroService;
    
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var carro = carroService.getCarro();
        model.addAttribute("carro", carro);
        return "/carro/listado";
    }
    
    @GetMapping("/nuevo")
    public String carroNuevo(Carro carro, Model model){
        return "/carro/modifica";
    }
    @PostMapping("/guardar")
    public String carroGuardar(Carro carro){
        carroService.save(carro);
        return "redirect:/carro/listado";
    }
    
    @GetMapping("/eliminar/{idCarro}")
    public String carroEliminar(Carro carro){
        carroService.delete(carro);
        return "redirect:/carro/listado";
    }
    
    @GetMapping("/modificar/{idCarro}")
    public String carroModificar(Carro carro, Model model){
        carro = carroService.getCarro(carro);
        model.addAttribute("carro", carro);
        return "/carro/modifica";
    }
    
}
