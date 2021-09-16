package com.example.cst438proj01;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "saved_jobs_table")
public class savedJob {


    @PrimaryKey(autoGenerate = true)
    private int id;
    private String positionTitle;
    private String positionSchedule;
    private String jobCategory;
    private int mUserID;

    public savedJob(String positionTitle, String positionSchedule, String jobCategory, int userID) {
        this.positionTitle = positionTitle;
        this.positionSchedule = positionSchedule;
        this.jobCategory = jobCategory;
        this.mUserID=userID;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getPositionSchedule() {
        return positionSchedule;
    }

    public void setPositionSchedule(String positionSchedule) {
        this.positionSchedule = positionSchedule;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public int getUserID() {
        return mUserID;
    }

    public void setUserID(int userID) {
        this.mUserID = userID;
    }

}
