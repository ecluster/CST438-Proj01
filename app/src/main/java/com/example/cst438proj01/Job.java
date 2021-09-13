package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

public class Job {

    private String positionTitle;
    private String positionSchedule;
    private String jobCategory;
    @SerializedName("SearchResult")
    private SearchResult searchResult;

    public Job(String positionTitle, String positionSchedule, String jobCategory) {
        this.positionTitle = positionTitle;
        this.positionSchedule = positionSchedule;
        this.jobCategory = jobCategory;
    }

    public String getPositionTitle(int i) {
        return searchResult.getSearchResultItems().get(i).getMatchedObjectDescriptor().getPositionTitle();
    }

    public String getPositionId(int i) {
        return searchResult.getSearchResultItems().get(i).getMatchedObjectDescriptor().getPositionID();
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

    public SearchResult getSearchResult() {
        return searchResult;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }
}
