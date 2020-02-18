package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

class MenuTest {

    @Test
    void prompt_FirstName() {
        ByteArrayInputStream in = new ByteArrayInputStream("Jamie".getBytes());
        int inLength = in.available();
        byte[] bytes = new byte[inLength];
        in.read(bytes, 0, inLength);
        String expected = new String(bytes, StandardCharsets.UTF_8);

        assertEquals(expected, "Jamie");
    }

    @Test
    void prompt_LastName() {
        ByteArrayInputStream in = new ByteArrayInputStream("Nguyen".getBytes());
        int inLength = in.available();
        byte[] bytes = new byte[inLength];
        in.read(bytes, 0, inLength);
        String expected = new String(bytes, StandardCharsets.UTF_8);

        assertEquals(expected, "Nguyen");
    }

    @Test
    void prompt_Street() {
        ByteArrayInputStream in = new ByteArrayInputStream("1655 Westhaven Drive".getBytes());
        int inLength = in.available();
        byte[] bytes = new byte[inLength];
        in.read(bytes, 0, inLength);
        String expected = new String(bytes, StandardCharsets.UTF_8);

        assertEquals(expected, "1655 Westhaven Drive");
    }

    @Test
    void prompt_City() {
        ByteArrayInputStream in = new ByteArrayInputStream("San Jose".getBytes());
        int inLength = in.available();
        byte[] bytes = new byte[inLength];
        in.read(bytes, 0, inLength);
        String expected = new String(bytes, StandardCharsets.UTF_8);

        assertEquals(expected, "San Jose");
    }

    @Test
    void prompt_State() {
        ByteArrayInputStream in = new ByteArrayInputStream("CA".getBytes());
        int inLength = in.available();
        byte[] bytes = new byte[inLength];
        in.read(bytes, 0, inLength);
        String expected = new String(bytes, StandardCharsets.UTF_8);

        assertEquals(expected, "CA");
    }

    @Test
    void prompt_Zip() {
        ByteArrayInputStream in = new ByteArrayInputStream("95132".getBytes());
        int inLength = in.available();
        byte[] bytes = new byte[inLength];
        in.read(bytes, 0, inLength);
        String expected = new String(bytes, StandardCharsets.UTF_8);

        assertEquals(expected, "95132");
    }

    @Test
    void prompt_Telephone() {
        ByteArrayInputStream in = new ByteArrayInputStream("408-569-5564".getBytes());
        int inLength = in.available();
        byte[] bytes = new byte[inLength];
        in.read(bytes, 0, inLength);
        String expected = new String(bytes, StandardCharsets.UTF_8);

        assertEquals(expected, "408-569-5564");
    }

    @Test
    void prompt_Email() {
        ByteArrayInputStream in = new ByteArrayInputStream("jamienguyen000@gmail.com".getBytes());
        int inLength = in.available();
        byte[] bytes = new byte[inLength];
        in.read(bytes, 0, inLength);
        String expected = new String(bytes, StandardCharsets.UTF_8);

        assertEquals(expected, "jamienguyen000@gmail.com");
    }
}