package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public Page<Persona> findAll(Pageable pageable) {
        return personaRepository.findAll(pageable);
    }
}
