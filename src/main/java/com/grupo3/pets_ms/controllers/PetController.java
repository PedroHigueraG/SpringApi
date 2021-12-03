package com.grupo3.pets_ms.controllers;

import com.grupo3.pets_ms.exceptions.PetNotFoundException;
import com.grupo3.pets_ms.models.Pets;
import com.grupo3.pets_ms.repositories.PetsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    private final PetsRepository petsRepository;

    public PetController(PetsRepository petsRepository){
        this.petsRepository = petsRepository;
    }

    @GetMapping("/pets")
    public List<Pets> getAllPets(){
        return  petsRepository.findAll();
    }

    @GetMapping("/pets/{id}")
    Pets getPet(@PathVariable String id){
        return petsRepository.findById(id).orElseThrow(()->new PetNotFoundException("No se encontró mascota cin id: "+id));
    }

    @PostMapping("/pets")
    Pets newPet(@RequestBody Pets pet){
        return petsRepository.save(pet);
    }
}
