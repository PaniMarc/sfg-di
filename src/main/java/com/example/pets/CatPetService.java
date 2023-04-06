package com.example.pets;

//@Profile("cat")
//@Service
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
