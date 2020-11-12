package com.mateusborja.javamethods.ex01;

public class Address extends Person {

    private String street;
    private String city;
    private String state;
    private int postalCode;
    private String country;

    public Address() {

    }

    public Address(String street, String city, String state, int postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Street = " + this.street + ", City = " + this.city + ", State = " + this.state + ", PostalCode = " + this.postalCode + ", Country = " +
                this.country;
    }
}
