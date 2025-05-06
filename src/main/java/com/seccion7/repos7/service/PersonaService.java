package com.seccion7.repos7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion7.repos7.model.Persona;
import com.seccion7.repos7.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona guardar(Persona persona){
        return personaRepository.create(persona);

    }

    public List<Persona> listartodas()
    {
        return personaRepository.readAll();
    }

    public Persona buscarporid(int id) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'buscarporid'");
        return personaRepository.read(id);
    }


    public Persona modificPersona(int id, Persona personamod)
    {
        return personaRepository.update(id, personamod);
    }

    public String eliminarPersona(int id)
    {
        personaRepository.delete(id);
        return "Persona eliminada";
    }

    /*public Persona buscarPorRut(String rut) {
        // TODO Auto-generated method stub
        return PersonaRepository.readByRut(rut);
    }*/

    public Persona buscarPorRut(String rut) {
        return personaRepository.readByRut(rut);
    }
}
