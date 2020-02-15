package com.company;
import java.io.*;
import java.util.*;

/**
 * @author Jamie Nguyen
 */
public class AddressBookApplication {
    public static void main(String[] args) throws FileNotFoundException {
        AddressBook ab = new AddressBook();

        ab.loadFromFile("/Users/jimjam/IdeaProjects/AddressBookApplication/out/production/AddressBookApplication/com/company/input.txt");
        // ab.list();

        ArrayList<AddressEntry>  searchResults= ab.find("Grewe");
        for(int i = 0; i < searchResults.size(); i++) {
            System.out.println(searchResults.get(i));
        }
    }
}
