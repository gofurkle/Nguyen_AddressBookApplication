package com.company;

public class AddressEntry {
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    Integer zip;
    String telephone;
    String email;

    AddressEntry() {
        this.firstName = "";
        this.lastName = "";
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = 0;
        this.telephone = "";
        this.email = "";
    }

    AddressEntry(String first, String last, String street, String city, String state, Integer zip, String tele, String email) {
        this.firstName = first;
        this.lastName = last;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.telephone = tele;
        this.email = email;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return this.street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Integer getZip() {
        return this.zip;
    }

    public void setTelephone(String tele) {
        this.telephone = tele;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString() {
        String entry = String.format
                ("First Name: %s\nLast Name: %s\nStreet: %s\nCity: %s\nState: %s\nZip: %s\nPhone: %s\nEmail: %s\n",
                        firstName, lastName, street, city, state, zip.toString(), telephone, email);

        return entry;
    }
}