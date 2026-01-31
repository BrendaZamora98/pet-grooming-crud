package com.mycompany.petgrooming.persistence;

import com.mycompany.petgrooming.logic.Owner;
import com.mycompany.petgrooming.logic.Pet;

public class PersistenceController {
    
    PetJpaController petJpa= new PetJpaController();
    OwnerJpaController ownerJpa= new OwnerJpaController();

    public void save(Owner owner, Pet pet) {
        
        //Create owner on DB
        ownerJpa.create(owner);
        
        //Create pet on DB
        petJpa.create(pet);
    }
    
}