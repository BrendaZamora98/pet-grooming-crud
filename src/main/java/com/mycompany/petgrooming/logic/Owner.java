package com.mycompany.petgrooming.logic;

public class Owner {
    
    //Attributes
    private int ownerId;
    private String ownerName;
    private String phone;
    private String address;

    
    //Constructors
    public Owner() {
    }

    public Owner(int ownerId, String ownerName, String phone, String address) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.phone = phone;
        this.address = address;
    }

    
    //Methods
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
