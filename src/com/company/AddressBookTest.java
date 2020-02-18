package com.company;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {
    private final AddressBook ab = new AddressBook();

    @BeforeAll
    void init() {
        AddressEntry entry1 = new AddressEntry("Jamie", "Nguyen", "1655 Westhaven Drive", "San Jose", "CA", 95132, "408-569-5564", "jamienguyen000@gmail.com");
    }

    @Test
    static void groupedAssertion() {
    }


}
