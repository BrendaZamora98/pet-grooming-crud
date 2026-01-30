package com.mycompany.petgrooming.logic;

public class Owner {
    
    private int ownerId;
    private String ownerName;
    private String phone;
    private String address;

    public Owner() {
    }

    public Owner(int ownerId, String ownerName, String phone, String address) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.phone = phone;
        this.address = address;
    }
    
}
