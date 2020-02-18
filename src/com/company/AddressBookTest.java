package com.company;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {
    @Test
    void add() {
        AddressEntry entry1 = new AddressEntry();
        AddressBook ab = new AddressBook();
        ab.add(entry1);
        assertEquals(ab.contacts.size(), 1);
        AddressEntry entry2 = new AddressEntry();
        ab.add(entry2);
        assertEquals(ab.contacts.size(), 2);
    }

    @Test
    void remove() {
        AddressBook ab = new AddressBook();
        AddressEntry entry1 = new AddressEntry();
        AddressEntry entry2 = new AddressEntry();
        AddressEntry entry3 = new AddressEntry();
        ab.add(entry1);
        ab.add(entry2);
        ab.add(entry3);
        assertEquals(ab.contacts.size(), 3);
        ab.remove(entry2);
        assertEquals(ab.contacts.size(), 2);
        ab.remove(entry1);
        assertEquals(ab.contacts.size(), 1);
    }

    @Test
    void find() {
        AddressBook ab = new AddressBook();
        AddressEntry entry1 = new AddressEntry("Jamie", "Nguyen", "1655 Westhaven Drive", "San Jose",
                "CA", 95132, "408-569-5564", "jamienguyen000@gmail.com");
        AddressEntry entry2 = new AddressEntry("Myan", "Pham", "1655 Westhaven Drive", "San Jose",
                "CA", 95132, "408-569-3068", "phamyan@yahoo.com");
        ab.add(entry1);
        ab.add(entry2);

        ArrayList<AddressEntry> entriesFound;

        // Test 1: Entries with last name starting with 'N'
        entriesFound = ab.find("N");
        String lastName = entriesFound.get(0).lastName;
        assertTrue(lastName.startsWith("N"));

        // Test 2: Entries with last name starting with 'P'
        entriesFound = ab.find("P");
        lastName = lastName = entriesFound.get(0).lastName;
        assertTrue(lastName.startsWith("P"));
    }

    @Test
    void list() {
        // Create AddressBook and add a new entry
        AddressBook ab = new AddressBook();
        AddressEntry entry1 = new AddressEntry("Jamie", "Nguyen", "1655 Westhaven Drive", "San Jose",
                "CA", 95132, "408-569-5564", "jamienguyen000@gmail.com");
        ab.add(entry1);

        //
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream ogOut = System.out;
        System.setOut(new PrintStream(output));


        ab.list();
        assertEquals("Jamie Nguyen\n1655 Westhaven Drive\nSan Jose, CA, 95132\njamienguyen000@gmail.com\n408-569-5564\n\n",output.toString());
    }

    @Test
    void readFromFile() throws FileNotFoundException {
        // Test 1: input.txt, 5 entries expected
        AddressBook ab = new AddressBook();
        assertEquals(ab.contacts.size(), 0);
        ab.readFromFile("input.txt");
        assertEquals(ab.contacts.size(), 5);

        // Test 2: input2.txt, 1 entry expected
        AddressBook ab2 = new AddressBook();
        ab2.readFromFile("input2.txt");
        assertEquals(ab2.contacts.size(), 1);
    }
}

