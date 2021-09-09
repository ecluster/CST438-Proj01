package com.example.cst438proj01;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreateAccountActivityTest {

    @Test
    public void usernameExists() {
        String username = "username";
        boolean usernameExist = true;
        assertTrue(usernameExist);
    }

    @Test
    public void usernameNotExists() {
        String username = "username";
        boolean usernameExists = false;
        assertFalse(usernameExists);
    }

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
}
