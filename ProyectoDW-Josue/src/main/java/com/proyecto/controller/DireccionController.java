package com.proyecto.controller;

import com.proyecto.domain.Direccion;
import com.proyecto.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller
@RequestMapping("/direccion")

public class DireccionController {
    @Autowired
    private DireccionService direccionService;
    
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var direccion = direccionService.getDireccion();
        model.addAttribute("direccion", direccion);
        return "/direccion/listado";
    }
    
    @GetMapping("/nuevo")
    public String direccionNueva(Direccion direccion, Model model){
        return "/direccion/modifica";
    }
    @PostMapping("/guardar")
    public String direccionGuardar(Direccion direccion){
        direccionService.save(direccion);
        return "redirect:/direccion/listado";
    }
    
    @GetMapping("/eliminar/{idDireccion}")
    public String direccionEliminar(Direccion direccion){
        direccionService.delete(direccion);
        return "redirect:/direccion/listado";
    }
    
    @GetMapping("/modificar/{idDireccion}")
    public String direccionModificar(Direccion direccion, Model model){
        direccion = direccionService.getDireccion(direccion);
        model.addAttribute("direccion", direccion);
        return "/direccion/modifica";
    }
    
}
