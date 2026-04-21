package com.spa_BN_DB.spa_BN_DB.models;

public class SpaPackage {
    private String type;
    private int basePrice;
    private int pricePerPerson;

    public SpaPackage() {}


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getPricePerPerson() {
        return pricePerPerson;
    }

    public void setPricePerPerson(int pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }
    

    
}
