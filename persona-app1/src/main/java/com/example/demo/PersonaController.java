package com.example.demo.controller;

import com.example.demo.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @GetMapping("/persona")
    public Persona getPersona() {
        // Retornar un nuevo objeto Persona con los datos solicitados
        return new Persona("Juan", "Pérez", 25);
    }
}
