package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * MatchedObjectDescriptor --- program to represent a matched
 * object descriptor for Job.
 * @author    Edward Cluster
 */

public class MatchedObjectDescriptor {

    // private variables
    @SerializedName("PositionID")
    private String positionID;

    @SerializedName("PositionTitle")
    private String positionTitle;

    @SerializedName("PositionLocation")
    private List<PositionLocation> positionLocation;

    // getters
    /**
     * Get the id of a position from MatchedObjectDescriptor
     * @return String
     */
    public String getPositionID() {
        return positionID;
    }
    /**
     * Get the title of a position from MatchedObjectDescriptor
     * @return String
     */
    public String getPositionTitle() {
        return positionTitle;
    }
    /**
     * Get the list of locations of a position from MatchedObjectDescriptor
     * @return List<PositionLocation>
     */
    public List<PositionLocation> getPositionLocation() {
        return positionLocation;
    }

    // setters
    /**
     * Set the id of a position from MatchedObjectDescriptor
     * @param positionID A string to hold the ID of a position
     */
    public void setPositionID(String positionID) {
        this.positionID = positionID;
    }
    /**
     * Set the title of a position from MatchedObjectDescriptor
     * @param positionTitle A string to hold the title of a position
     */
    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }
    /**
     * Set the list of locations of a position from MatchedObjectDescriptor
     * @param List<PositionLocation> An array list to hold the list of locations
     * of a position
     */
    public void setPositionLocation(List<PositionLocation> positionLocation) {
        this.positionLocation = positionLocation;
    }
}
