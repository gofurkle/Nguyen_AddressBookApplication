package com.company;
import java.io.*;
import java.util.*;

/**
 * @author Jamie Nguyen
 */
public class AddressBookApplication {
    public static void main(String[] args) throws FileNotFoundException {
        AddressBook ab = new AddressBook();

        Scanner scanTask = new Scanner(System.in);
        boolean menu = true;
        String task = "";
        while(menu) {
            System.out.println("a) Load from File\n" +
                               "b) Add new entry\n"  +
                               "c) Remove entry\n"   +
                               "d) Find entry\n"     +
                               "e) List entry\n"     +
                               "f) Quit\n");

            task = scanTask.nextLine();
            ArrayList<AddressEntry> entriesFound;
            Scanner scanPrefix = new Scanner(System.in);
            String prefix;

            switch(task) {
                case "a":   // Load from file
                    Scanner scanFileName = new Scanner(System.in);
                    System.out.println("Enter file name: ");
                    String fileName = scanFileName.nextLine();
                    ab.loadFromFile(fileName);
                    break;
                case "b":   // Add an entry
                    String firstName = Menu.prompt_FirstName();
                    String lastName = Menu.prompt_LastName();
                    String street = Menu.prompt_Street();
                    String city = Menu.prompt_City();
                    String state = Menu.prompt_State();
                    int zip = Integer.parseInt(Menu.prompt_Zip());
                    String phoneNumber = Menu.prompt_Telephone();
                    String email = Menu.prompt_Email();
                    AddressEntry newEntry = new AddressEntry(firstName, lastName, street, city, state, zip, phoneNumber, email);
                    ab.add(newEntry);
                    break;
                case "c":   // Remove an entry
                    System.out.println("Enter the last name of the contact you want to remove: ");
                    prefix = scanPrefix.nextLine();
                    entriesFound = ab.find(prefix);
                    System.out.printf("The following %d entries were found in the AddressBook that match your search criteria. Select the" +
                            "number for the entry you wish to remove:", entriesFound.size());
                    for(int i = 0; i < entriesFound.size(); i++) {
                        System.out.println(entriesFound.get(i));
                    }
                    Scanner scanSelection = new Scanner(System.in);
                    String selection = scanSelection.nextLine();
                    ab.remove(entriesFound.get(Integer.parseInt(selection)));
                    break;
                case "d":   // Find an entry(s)
                    System.out.println("Enter in all or the beginning of the last name of the contact you wish to find: ");
                    prefix = scanPrefix.nextLine();
                    entriesFound = ab.find(prefix);
                    System.out.printf("The following %d entries were found in the AddressBook for a last name starting with '%s':\n",
                            entriesFound.size(), prefix);
                    for(int i = 0; i < entriesFound.size(); i++) {
                        System.out.println(entriesFound.get(i));
                    }
                    break;
                case "e":   // List all entry(s)
                    ab.list();
                    break;
                case "f":
                    menu = false;
                    System.exit(0);
            }
        }
    }
}
