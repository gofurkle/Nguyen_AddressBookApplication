package com.company;

/**
 * @author Jamie Nguyen
 */
public class AddressEntry {
    /**
     * Stores the first name of the person of this AddressEntry
     */
    String firstName;

    /**
     * Stores the first name of the person of this AddressEntry
     */
    String lastName;

    /**
     * Stores the street of the person of this AddressEntry
     */
    String street;

    /**
     * Stores the city of the person of this AddressEntry
     */
    String city;

    /**
     * Stores the state of the person of this AddressEntry
     */
    String state;

    /**
     * Stores the zip code of the person of this AddressEntry
     */
    int zip;

    /**
     * Stores the telephone number of the person of this AddressEntry
     */
    String telephone;

    /**
     * Stores the email address of the person of this AddressEntry
     */
    String email;

    /**
     * Default constructor
     * Initializes all values to empty string or 0
     */
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

    /**
     * Entry Constructor
     * @param first first name
     * @param last last name
     * @param street street
     * @param city city
     * @param state state
     * @param zip zip code
     * @param tele telephone number
     * @param email email address
     */
    AddressEntry(String first, String last, String street, String city, String state, int zip, String tele, String email) {
        this.firstName = first;
        this.lastName = last;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.telephone = tele;
        this.email = email;
    }

    /**
     * Sets firstName to first
     * @param first
     */
    public void setFirstName(String first) {
        this.firstName = first;
    }

    /**
     * Returns this AddressEntry's firstName
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets lastName to last
     * @param last
     */
    public void setLastName(String last) {
        this.lastName = last;
    }

    /**
     * Returns this AddressEntry's lastName
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Sets street to street
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Returns this AddressEntry's street
     * @return street
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Sets city to city
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns this AddressEntry's city
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets state to state
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Returns this AddressEntry's state
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * Sets zip to zip
     * @param zip
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Returns this AddressEntry's zip
     * @return zip
     */
    public int getZip() {
        return this.zip;
    }

    /**
     * Sets telephone to tele
     * @param tele
     */
    public void setTelephone(String tele) {
        this.telephone = tele;
    }

    /**
     * Returns this AddressEntry's telephone
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * Sets email to email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns this AddressEntry's email
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Returns a string containing contents of this AddressEntry separated by new lines
     * @return entry
     */
    public String toString() {
        String entry = String.format
                ("%s %s\n%s\n%s, %s, %d\n%s\n%s\n",
                        firstName, lastName, street, city, state, zip, email, telephone);
        return entry;
    }
}