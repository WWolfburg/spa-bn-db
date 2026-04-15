package com.spa_BN_DB.spa_BN_DB.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "bookings")
public class Booking {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private SpaPackage spaPackage;
    private String spaTime;
    private String spaDate;
    private int numberOfPeople;
    private int totalPrice;

    public Booking() {}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SpaPackage getSpaPackage() {
        return spaPackage;
    }

    public void setSpaPackage(SpaPackage spaPackage) {
        this.spaPackage = spaPackage;
    }

    public String getSpaTime() {
        return spaTime;
    }

    public void setSpaTime(String spaTime) {
        this.spaTime = spaTime;
    }

    public String getSpaDate() {
        return spaDate;
    }

    public void setSpaDate(String spaDate) {
        this.spaDate = spaDate;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

}
