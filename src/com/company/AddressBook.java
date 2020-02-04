package com.company;

import java.util.*;

public class AddressBook {
    LinkedList<AddressEntry> contacts;

    AddressBook() {
        contacts = new LinkedList<AddressEntry>();
    }

    public void add(AddressEntry entry) {
        contacts.addLast(entry);
    }

    public void list() {
        Iterator it = contacts.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
