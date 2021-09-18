package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

/**
 * Job --- program to represent a Job".
 * @author    Edward Cluster
 */

public class Job {

    // private variables
    private String positionTitle;
    private String positionId;
    private String positionLocation;
  
    @SerializedName("SearchResult")
    private SearchResult searchResult;

    // getters
    /**
     * Get the title of the position from the search result
     * @param  i An int to iterate through
     * an array of SearchResultItems
     * @return String.
     */
    public String getPositionTitle(int i) {
        return searchResult.getSearchResultItems().get(i).getMatchedObjectDescriptor().getPositionTitle();
    }
    /**
     * Get the ID of the position from the search result
     * @param  i An int to iterate through
     * an array of SearchResultItems
     * @return String.
     */
    public String getPositionId(int i) {
        return searchResult.getSearchResultItems().get(i).getMatchedObjectDescriptor().getPositionID();
    }
    /**
     * Get the name of location of the position from the search result
     * @param  i An int to iterate through
     * an array of SearchResultItems
     * @return String.
     */
    public String getLocationName(int i) {
        return searchResult.getSearchResultItems().get(i).getMatchedObjectDescriptor().getPositionLocation().get(0).getLocationName();
    }
    /**
     * Get the search result from a Json response
     * @return SearchResult.
     */
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
    /**
     * Sets the search result for a Job
     * @param  searchResult A SearchResult object
     * containing search result items
     * @return No return value.
     */
    public void setSearchResult(SearchResult searchResult) {
        this.searchResult = searchResult;
    }
}
