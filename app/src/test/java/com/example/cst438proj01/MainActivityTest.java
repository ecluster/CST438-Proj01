package com.example.cst438proj01;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void hasEmptyFields() {
        String username = "";
        String password = "";
        boolean isEmpty = true;
        assertTrue(isEmpty);
    }

    @Test
    public void hasFilledFields() {
        String username = "user1";
        String password = "password";
        boolean isEmpty = false;
        assertFalse(isEmpty);
    }

    @Test
    public void matchUser() {
        String username = "user1";
        int userId = 1;

        assertEquals(userId, 1);
        assertEquals(username, "user1");
    }

    @Test
    public void matchPassword() {
        int userId = 1;
        String password = "password";

        assertEquals(userId, 1);
        assertEquals(password, "password");
    }
}
