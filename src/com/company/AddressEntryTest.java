package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;

class AddressEntryTest {
    private AddressEntry entry;

    @BeforeEach
    void init() {
        entry = new AddressEntry();
    }


    @Test
    void setFirstName() {
        // Expected string value
        String expected = "Jamie";

        // Set the first name field of entry to 'Jamie'
        entry.setFirstName("Jamie");

        // Actual value of String taken directly from entry's first name field
        String actual = entry.getFirstName();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void getFirstName() {
        // Expected string value
        String expected = "Jamie";

        // Set the first name field of entry to 'Jamie'
        entry.setFirstName("Jamie");

        // Actual value of String taken directly from entry's first name field
        String actual = entry.getFirstName();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void setLastName() {
        // Expected string value
        String expected = "Nguyen";

        // Set the last name field of entry
        entry.setLastName("Nguyen");

        // Actual value of String taken directly from entry's last name field
        String actual = entry.getLastName();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void getLastName() {
        // Expected string value
        String expected = "Nguyen";

        // Set the last name field of entry
        entry.setLastName("Nguyen");

        // Actual value of String taken directly from entry's last name field
        String actual = entry.getLastName();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void setStreet() {
        // Expected string value
        String expected = "1655 Westhaven Drive";

        // Set the street field of entry
        entry.setStreet("1655 Westhaven Drive");

        // Actual value of String taken directly from entry's street field
        String actual = entry.getStreet();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void getStreet() {
        // Expected string value
        String expected = "1655 Westhaven Drive";

        // Set the street field of entry
        entry.setStreet("1655 Westhaven Drive");

        // Actual value of String taken directly from entry's street field
        String actual = entry.getStreet();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void setCity() {
        // Expected string value
        String expected = "San Jose";

        // Set the city field of entry
        entry.setCity("San Jose");

        // Actual value of String taken directly from entry's city field
        String actual = entry.getCity();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void getCity() {
        // Expected string value
        String expected = "San Jose";

        // Set the city field of entry
        entry.setCity("San Jose");

        // Actual value of String taken directly from entry's city field
        String actual = entry.getCity();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void setState() {
        // Expected string value
        String expected = "CA";

        // Set the state field of entry
        entry.setState("CA");

        // Actual value of String taken directly from entry's state field
        String actual = entry.getState();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void getState() {
        // Expected string value
        String expected = "CA";

        // Set the state field of entry
        entry.setState("CA");

        // Actual value of String taken directly from entry's state field
        String actual = entry.getState();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void setZip() {
        // Expected string value
        int expected = 95132;

        // Set the zip field of entry
        entry.setZip(95132);

        // Actual value of taken directly from entry's zip field
        int actual = entry.getZip();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void getZip() {
        // Expected string value
        int expected = 95132;

        // Set the zip field of entry
        entry.setZip(95132);

        // Actual value of taken directly from entry's zip field
        int actual = entry.getZip();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void setTelephone() {
        // Expected string value
        String expected = "408-569-5564";

        // Set the telephone field of entry
        entry.setTelephone("408-569-5564");

        // Actual value of String taken directly from entry's telephone field
        String actual = entry.getTelephone();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void getTelephone() {
        // Expected string value
        String expected = "408-569-5564";

        // Set the telephone field of entry
        entry.setTelephone("408-569-5564");

        // Actual value of String taken directly from entry's telephone field
        String actual = entry.getTelephone();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void setEmail() {
        // Expected string value
        String expected = "jamienguyen000@gmail.com";

        // Set the email field of entry
        entry.setEmail("jamienguyen000@gmail.com");

        // Actual value of String taken directly from entry's email field
        String actual = entry.getEmail();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void getEmail() {
        // Expected string value
        String expected = "jamienguyen000@gmail.com";

        // Set the email field of entry
        entry.setEmail("jamienguyen000@gmail.com");

        // Actual value of String taken directly from entry's email field
        String actual = entry.getEmail();

        // Test if actual == expected
        assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        // Fill all the fields of entry
        entry.setFirstName("Jamie");
        entry.setLastName("Nguyen");
        entry.setStreet("1655 Westhaven Drive");
        entry.setCity("San Jose");
        entry.setState("CA");
        entry.setZip(95132);
        entry.setEmail("jamienguyen000@gmail.com");
        entry.setTelephone("408-569-5564");
        assertEquals("Jamie Nguyen\n1655 Westhaven Drive\nSan Jose, CA, 95132\njamienguyen000@gmail.com\n408-569-5564\n",entry.toString());


    }
}