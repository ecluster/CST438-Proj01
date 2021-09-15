package com.example.cst438proj01;



import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(AndroidJUnit4.class)
public class DBtest {
    private UserDAO userDao;
    private database db;
    private User user;
    private String userName;
    private String userPassword;
    private String userName2;
    private String userPassword2;
    @Before
    public void createDb() {
        Context context = ApplicationProvider.getApplicationContext();
        db = Room.inMemoryDatabaseBuilder(context, database.class).build();
        userDao = db.getIneptDAO();
        userName="testuser1";
        userPassword="testuser1";
        user= new User(userName,userPassword);
        //user.setUserId(1);
        userDao.insert(user);

    }

    @After
    public void closeDb() throws IOException {
        db.close();
    }
    @Test
    public void getusername() throws Exception {

        assertEquals(userName, userDao.getUserByUsername(userName).getUserName());

    }
    @Test
    public void getpassword() throws Exception {

        assertEquals(userPassword, userDao.getUserByUsername(userName).getPassword());

    }
    @Test
    public void getID() throws Exception {

        assertEquals(1, userDao.getUserByUsername(userName).getUserId());

    }

}
