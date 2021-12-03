package com.grupo3.pets_ms.exceptions;

public class PetNotFoundException extends RuntimeException{
    public PetNotFoundException(String message){
        super(message);
    }
}
