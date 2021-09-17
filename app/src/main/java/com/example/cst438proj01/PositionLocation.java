package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

public class PositionLocation {

    // private variables
    @SerializedName("LocationName")
    private String locationName;

    // getters
    public String getLocationName() {
        return locationName;
    }

    // setters
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
