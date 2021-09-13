package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

public class MatchedObjectDescriptor {

    @SerializedName("PositionID")
    private String positionID;

    @SerializedName("PositionTitle")
    private String positionTitle;

    public String getPositionID() {
        return positionID;
    }

    public String getPositionTitle() {
        return positionTitle;
    }


}
