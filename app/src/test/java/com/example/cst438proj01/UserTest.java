package com.example.cst438proj01;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    @Test
    public void getUserId() {
        User user = new User("test", "123");
        user.setUserId(1);
        assertEquals(1, user.getUserId());
    }

    @Test
    public void getUserName() {
        User user = new User("test", "123");
        assertEquals("test", user.getUserName());
    }

    @Test
    public void getPassword() {
        User user = new User("test", "123");
        assertEquals("123", user.getPassword());
    }

    @Test
    public void setUsername() {
        User user = new User("", "");
        user.setUserName("test");
    }

    @Test
    public void setPassword() {
        User user = new User("", "");
        user.setPassword("123");
    }

    @Test
    public void toStringPrint() {
        String output;
        User user = new User("test", "123");
        user.setUserId(1);
        output = "UserId:1\nUserName: test\nPassword: 123\n";
        assertEquals(output, user.toString());
    }

}
