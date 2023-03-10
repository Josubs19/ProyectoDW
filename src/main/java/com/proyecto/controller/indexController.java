package com.proyecto.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@Controller
@Slf4j

public class indexController {

    @GetMapping("/")
    public String inicio(Model model){
        return "index";
    }

    
}
