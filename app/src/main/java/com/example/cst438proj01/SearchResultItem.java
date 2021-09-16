package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

public class SearchResultItem {

    // private variables
    @SerializedName("MatchedObjectId")
    private String matchedObjectId;

    @SerializedName("MatchedObjectDescriptor")
    private MatchedObjectDescriptor matchedObjectDescriptor;

    // getters
    public String getMatchedObjectId() {
        return matchedObjectId;
    }

    public MatchedObjectDescriptor getMatchedObjectDescriptor() {
        return matchedObjectDescriptor;
    }

    // setters
    public void setMatchedObjectId(String matchedObjectId) {
        this.matchedObjectId = matchedObjectId;
    }

    public void setMatchedObjectDescriptor(MatchedObjectDescriptor matchedObjectDescriptor) {
        this.matchedObjectDescriptor = matchedObjectDescriptor;
    }
}
