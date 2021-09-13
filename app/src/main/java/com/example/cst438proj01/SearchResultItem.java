package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

public class SearchResultItem {

    @SerializedName("MatchedObjectId")
    private String matchedObjectId;

    @SerializedName("MatchedObjectDescriptor")
    private MatchedObjectDescriptor matchedObjectDescriptor;

    public String getMatchedObjectId() {
        return matchedObjectId;
    }

    public MatchedObjectDescriptor getMatchedObjectDescriptor() {
        return matchedObjectDescriptor;
    }
}
