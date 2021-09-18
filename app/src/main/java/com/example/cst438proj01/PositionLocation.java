package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

/**
 * PositionLocation --- program to represent a location of a position
 * @author    Edward Cluster
 */

public class PositionLocation {

    // private variables
    @SerializedName("LocationName")
    private String locationName;

    // getters
    /**
     * Get the name of a location from PositionLocation
     * @return String
     */
    public String getLocationName() {
        return locationName;
    }

    // setters
    /**
     * Set the name of location for PositionLocation
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
