package com.company;

import java.io.*;
import java.util.Scanner;

/**
 * @author Jamie Nguyen
 */
public class Menu {
    /**
     * Prompts user to input a first name and returns it
     * @return firstName string input from user
     */
    static String prompt_FirstName() {
        Scanner input = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = input.nextLine();
        return firstName;
    }

    /**
     * Prompts user to input a last name and returns it
     * @return lastName string input from user
     */
    static String prompt_LastName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Last Name: ");
        String lastName = input.nextLine();
        return lastName;
    }

    /**
     * Prompts user to input a street and returns it
     * @return street string input from user
     */
    static String prompt_Street() {
        Scanner input = new Scanner(System.in);
        System.out.println("Street: ");
        String street = input.nextLine();
        return street;
    }

    /**
     * Prompts user to input city and returns it
     * @return city string input from user
     */
    static String prompt_City() {
        Scanner input = new Scanner(System.in);
        System.out.println("City: ");
        String city = input.nextLine();
        return city;
    }

    /**
     * Prompts user to input state and returns it
     * @return state string input from user
     */
    static String prompt_State() {
        Scanner input = new Scanner(System.in);
        System.out.println("State: ");
        String state = input.nextLine();
        return state;
    }

    /**
     * Prompts user to input zip code and returns it
     * @return zip string input from user
     */
    static String prompt_Zip() {
        Scanner input = new Scanner(System.in);
        System.out.println("Zip Code: ");
        String zip = input.nextLine();
        return zip;
    }

    /**
     * Prompts user to input telephone number and returns it
     * @return phoneNum string input from user
     */
    static String prompt_Telephone() {
        Scanner input = new Scanner(System.in);
        System.out.println("Telephone Number: ");
        String phoneNum = input.nextLine();
        return phoneNum;
    }

    /**
     * Prompts user to input email address
     * @return email string input from user
     */
    static String prompt_Email() {
        Scanner input = new Scanner(System.in);
        System.out.println("Email: ");
        String email = input.nextLine();
        return email;
    }
}