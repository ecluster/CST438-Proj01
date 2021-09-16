package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

public class Job {

    // private variables
    private String positionTitle;
    private String positionId;
    private String positionLocation;
    @SerializedName("SearchResult")
    private SearchResult searchResult;

    // getters
    public String getPositionTitle(int i) {
        return searchResult.getSearchResultItems().get(i).getMatchedObjectDescriptor().getPositionTitle();
    }
    public String getPositionId(int i) {
        return searchResult.getSearchResultItems().get(i).getMatchedObjectDescriptor().getPositionID();
    }
    public String getLocationName(int i) {
        return searchResult.getSearchResultItems().get(i).getMatchedObjectDescriptor().getPositionLocation().get(0).getLocationName();
    }
    public SearchResult getSearchResult() {
        return searchResult;
    }

    // setters
    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }
    public void setPositionLocation(String positionLocation) {
        this.positionLocation = positionLocation;
    }
    public void setSearchResult(SearchResult searchResult) {
        this.searchResult = searchResult;
    }
}
