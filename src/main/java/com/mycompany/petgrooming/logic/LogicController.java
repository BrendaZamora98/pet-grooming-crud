package com.mycompany.petgrooming.logic;

import com.mycompany.petgrooming.persistence.PersistenceController;

public class LogicController {
    
    PersistenceController persisControl= new PersistenceController();

    public void save(String petName, String breed, String color, String allergies, String spCare, String ownerName, String phone, String address) {
             
        //Create owner and assign values
        Owner owner= new Owner();
        owner.setOwnerName(ownerName);
        owner.setPhone(phone);
        owner.setAddress(address);
        
        // Create pet and assign values
        Pet pet= new Pet();
        pet.setPetName(petName);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setAllergies(allergies);
        pet.setSpecialCare(spCare);
        pet.setTheOwner(owner);
        
        persisControl.save(owner, pet);
    }
}