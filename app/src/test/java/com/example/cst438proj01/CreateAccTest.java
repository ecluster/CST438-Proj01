package com.example.cst438proj01;

import org.junit.Test;
import static org.junit.Assert.*;

import android.content.Context;

public class CreateAccTest {
    @Test
    public void emptyUserField() {
        String username = "";
        assertEquals(true, CreateAcc.isUsernameEmpty(username));
    }

    @Test
    public void emptyPasswordField() {
        String password = "";
        assertEquals(true, CreateAcc.isPasswordEmpty(password));
    }

    @Test
    public void filledUserField() {
        String username = "user";
        assertEquals(false, CreateAcc.isUsernameEmpty(username));
    }

    @Test
    public void filledPasswordField() {
        String password = "password";
        assertEquals(false, CreateAcc.isPasswordEmpty(password));
    }

    @Test
    public void hasInput() {
        String username = "user";
        String password = "password";
        assertEquals(true, CreateAcc.hasInput(username, password));
    }

    @Test
    public void hasNoInput() {
        String u = "";
        String p = "";
        assertEquals(false, CreateAcc.hasInput(u, p));
    }

    @Test
    public void hasSomeInputWithUsername() {
        String u = "test";
        String p = "";
        assertEquals(true, CreateAcc.hasInput(u, p));
    }

    @Test
    public void hasSomeInputWithPassword() {
        String u = "";
        String p = "test";
        assertEquals(true, CreateAcc.hasInput(u, p));
    }

}
