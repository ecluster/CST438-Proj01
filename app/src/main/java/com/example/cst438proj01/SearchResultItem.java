package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

/**
 * SearchResultItems --- program to represent the items of a search result
 * @author    Edward Cluster
 */

public class SearchResultItem {

    // private variables
    @SerializedName("MatchedObjectId")
    private String matchedObjectId;

    @SerializedName("MatchedObjectDescriptor")
    private MatchedObjectDescriptor matchedObjectDescriptor;

    // getters

    /**
     * get the id of a MatchedObject
     * @return String
     */
    public String getMatchedObjectId() {
        return matchedObjectId;
    }
    /**
     * get the descriptor of a MatchedObject
     * @return MatchedObjectDescriptor
     */
    public MatchedObjectDescriptor getMatchedObjectDescriptor() {
        return matchedObjectDescriptor;
    }

    // setters
    /**
     * set the id of a MatchedObject
     * @param matchedObjectId A string to hold the if of a MatchedObject
     */
    public void setMatchedObjectId(String matchedObjectId) {
        this.matchedObjectId = matchedObjectId;
    }
    /**
     * set the descriptor of a MatchedObjectDescriptor
     * @param matchedObjectDescriptor A MatchedObjectDescriptor object
     */
    public void setMatchedObjectDescriptor(MatchedObjectDescriptor matchedObjectDescriptor) {
        this.matchedObjectDescriptor = matchedObjectDescriptor;
    }
}
