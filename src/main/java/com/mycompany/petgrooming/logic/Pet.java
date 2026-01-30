package com.mycompany.petgrooming.logic;

public class Pet {
    
    //Attributes
    private int petId;
    private String petName;
    private String breed;
    private String color;
    private String allergies;
    private String specialCare;
    private Owner theOwner;
    
    
    //Contructors
    public Pet() {
    }

    public Pet(int petId, String petName, String breed, String color, String allergies, String specialCare, Owner theOwner) {
        this.petId = petId;
        this.petName = petName;
        this.breed = breed;
        this.color = color;
        this.allergies = allergies;
        this.specialCare = specialCare;
        this.theOwner = theOwner;
    }

        
    //Methods
    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getSpecialCare() {
        return specialCare;
    }

    public void setSpecialCare(String specialCare) {
        this.specialCare = specialCare;
    }

    public Owner getTheOwner() {
        return theOwner;
    }

    public void setTheOwner(Owner theOwner) {
        this.theOwner = theOwner;
    }
    
}
