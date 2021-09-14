package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

public class Job {

    // private variables
    private String positionTitle;
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
    public void setSearchResult(SearchResult searchResult) {
        this.searchResult = searchResult;
    }
}
