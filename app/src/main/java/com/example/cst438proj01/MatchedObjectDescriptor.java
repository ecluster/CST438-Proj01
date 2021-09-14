package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchedObjectDescriptor {

    // private variables
    @SerializedName("PositionID")
    private String positionID;

    @SerializedName("PositionTitle")
    private String positionTitle;

    @SerializedName("PositionLocation")
    private List<PositionLocation> positionLocation;

    // getters
    public String getPositionID() {
        return positionID;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public List<PositionLocation> getPositionLocation() {
        return positionLocation;
    }

    // setters
    public void setPositionID(String positionID) {
        this.positionID = positionID;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public void setPositionLocation(List<PositionLocation> positionLocation) {
        this.positionLocation = positionLocation;
    }
}
