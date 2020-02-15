package com.company;
import java.io.*;

/**
 * @author Jamie Nguyen
 */
public class AddressBookApplication {
    public static void main(String[] args) throws FileNotFoundException {
        AddressBook ab = new AddressBook();
//        Menu.prompt_FirstName();
//        Menu.prompt_LastName();
//        Menu.prompt_Street();
//        Menu.prompt_City();
//        Menu.prompt_State();
//        Menu.prompt_Zip();
//        Menu.prompt_Telephone();
//        Menu.prompt_Email();
//        initAddressBookExercise(ab);

        ab.init("/Users/jimjam/IdeaProjects/AddressBookApplication/out/production/AddressBookApplication/com/company/input.txt");
        ab.list();
    }

    /**
     * Initializes the AddressBook given as ab with two AddressEntry's and displays the contents of ab
     * @param ab This is the AddressBook to initialize
     */
    static void initAddressBookExercise(AddressBook ab) {
        AddressEntry entry1 = new AddressEntry("Jamie", "Nguyen", "123 abc", "San Jose", "Ca", 95132, "4085695564","jnguyen127@horizon.csueastbay.edu");
        AddressEntry entry2 = new AddressEntry();
        ab.add(entry1);
        ab.add(entry2);
        ab.list();
    }
}
