package com.mycompany.petgrooming.logic;

public class Pet {
    
    private int petId;
    private String petName;
    private String breed;
    private String color;
    private String allergies;
    private String specialCare;

    public Pet() {
    }

    public Pet(int petId, String petName, String breed, String color, String allergies, String specialCare) {
        this.petId = petId;
        this.petName = petName;
        this.breed = breed;
        this.color = color;
        this.allergies = allergies;
        this.specialCare = specialCare;
    }
    
}
