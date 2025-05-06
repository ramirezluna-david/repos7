package com.seccion7.repos7.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion7.repos7.model.Persona;
import com.seccion7.repos7.service.PersonaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;







@RequestMapping("/api/personas")
@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> listaPersonas() {
        return personaService.listartodas();
    }

    @GetMapping("/{id}") //.../api/personas/2
    public Persona getbyId(@PathVariable int id) {
        return personaService.buscarporid(id);
    }
    

    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona) {
       
        return personaService.guardar(persona);

    }

    @PutMapping("/{id}")
    public Persona putMethodName(@PathVariable int id, @RequestBody Persona personamod) {

        return personaService.modificPersona(id, personamod);
    }

    @DeleteMapping("/{id}")
    public String deletePersona(@PathVariable int id)
    {
        return personaService.eliminarPersona(id);
    }


    
    
}
