package com.example.cst438proj01;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = database.USER_TABLE)
public class User {

    @PrimaryKey(autoGenerate = true)
    private int mUserId;

    private String mUserName;


    private String mPassword;

    public User(String mUserName, String mPassword ) {
        this.mUserName = mUserName;
        this.mPassword = mPassword;

    }




    public int getUserId() {
        return mUserId;
    }

    public void setUserId(int mUserId) {
        this.mUserId = mUserId;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String mPassword) {
        this.mPassword = mPassword;
    }


    @Override
    public String toString() {
        String output;
        output= "UserId:" + mUserId + "\n";;
        output+="UserName: " + mUserName+ "\n";
        output+="Password: " + mPassword+ "\n";
        return output;
    }//test for fixing git21
}