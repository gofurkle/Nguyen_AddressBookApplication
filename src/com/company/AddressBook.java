package com.company;

import java.io.*;
import java.util.*;

/**
 * @author Jamie Nguyen
 */
public class AddressBook {
    ArrayList<AddressEntry> contacts;

    /**
     * Default constructor
     * Initializes a new ArrayList to hold AddressEntry's
     */
    AddressBook() {
        contacts = new ArrayList<AddressEntry>();
    }

    /**
     * Adds an AddressEntry to the list in alphabetical order
     * @param entry An AddressEntry to be added to the LinkedList
     */
    public void add(AddressEntry entry) {
        contacts.add(entry);
        contacts.sort(new ContactComparator());
    }

    /**
     * Goes through the list of AddressEntry's using an iterator and displays the elements of each AddressEntry
     */
    public void list() {
        Iterator it = contacts.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * Initializes the AddressBook with AddressEntry's from a specially formatted
     * @param filename Specially formatted text file
     * @throws FileNotFoundException
     */
    public void init(String filename) throws FileNotFoundException {
        try {
            File in = new File(filename);
            BufferedReader inputBuffer = new BufferedReader(new FileReader(in));
            String line;                                // Temporary string to hold data from current line
            int lineNum = 0;                            // Keeps count of lines to help with parsing input file
            AddressEntry entry = new AddressEntry();    // Temporary AddressEntry to hold values
            while((line = inputBuffer.readLine()) != null) {
                if(lineNum % 8 == 0) {
                    entry.firstName = line;
                }
                if(lineNum % 8 == 1) {
                    entry.lastName = line;
                }
                if(lineNum % 8 == 2) {
                    entry.street = line;
                }
                if(lineNum  % 8 == 3) {
                    entry.city = line;
                }
                if(lineNum % 8 == 4) {
                    entry.state = line;
                }
                if(lineNum % 8 == 5) {
                    entry.zip = Integer.parseInt(line);
                }
                if(lineNum % 8 == 6) {
                    entry.email = line;
                }
                if(lineNum % 8 == 7) {
                    entry.telephone = line;
                    this.add(entry);
                    entry = new AddressEntry();
                }
                lineNum++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found.");
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * Custom compare method used to sort the list of AddressEntry's in AddressBook
 */
class ContactComparator implements Comparator<AddressEntry> {
    /**
     * Overrides the compare method to sort AddressEntry's.
     * Used to sort based on last name, but if last names are the same, sorts by first name;
     * @param e1
     * @param e2
     * @return int value containing the result of compareTo()
     */
    @Override
    public int compare(AddressEntry e1, AddressEntry e2) {
        int lastNameComp = (e1.lastName).compareTo(e2.lastName);
        if(lastNameComp != 0) {
            return (e1.lastName).compareTo(e2.lastName);
        } else {
            return (e1.firstName).compareTo(e2.firstName);
        }
    }
}
