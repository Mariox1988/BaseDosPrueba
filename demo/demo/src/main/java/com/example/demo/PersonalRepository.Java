package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.example.demo.model.Persona;

public interface PersonaRepository extends PagingAndSortingRepository<Persona, Long> {
}