package com.grupo3.pets_ms.repositories;

import com.grupo3.pets_ms.models.Pets;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetsRepository extends MongoRepository<Pets,String>{
}
