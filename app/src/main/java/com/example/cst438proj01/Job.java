package com.example.cst438proj01;

public class Job {

    private String positionTitle;
    private String positionSchedule;
    private String jobCategory;

    public Job(String positionTitle, String positionSchedule, String jobCategory) {
        this.positionTitle = positionTitle;
        this.positionSchedule = positionSchedule;
        this.jobCategory = jobCategory;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public String getPositionSchedule() {
        return positionSchedule;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public void setPositionSchedule(String positionSchedule) {
        this.positionSchedule = positionSchedule;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }
}
