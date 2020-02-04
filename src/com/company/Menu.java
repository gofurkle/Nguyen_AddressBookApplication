package com.company;

import java.util.Scanner;

public class Menu {
    static String prompt_FirstName() {
        Scanner input = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = input.nextLine();
        return firstName;
    }

    static String prompt_LastName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Last Name: ");
        String lastName = input.nextLine();
        return lastName;
    }

    static String prompt_Street() {
        Scanner input = new Scanner(System.in);
        System.out.println("Street: ");
        String street = input.nextLine();
        return street;
    }

    static String prompt_City() {
        Scanner input = new Scanner(System.in);
        System.out.println("City: ");
        String city = input.nextLine();
        return city;
    }

    static String prompt_State() {
        Scanner input = new Scanner(System.in);
        System.out.println("State: ");
        String state = input.nextLine();
        return state;
    }

    static String prompt_Zip() {
        Scanner input = new Scanner(System.in);
        System.out.println("Zip Code: ");
        String zip = input.nextLine();
        return zip;
    }

    static String prompt_Telephone() {
        Scanner input = new Scanner(System.in);
        System.out.println("Telephone Number: ");
        String phoneNum = input.nextLine();
        return phoneNum;
    }

    static String prompt_Email() {
        Scanner input = new Scanner(System.in);
        System.out.println("Email: ");
        String email = input.nextLine();
        return email;
    }
}