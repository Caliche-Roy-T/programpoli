package com.politecnico.Programacion.controler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class inicio {
    @GetMapping("/")
    public String Inicio() {
        return "Hola Mundo " + "Desde Spring Boot";
    }
    

}
