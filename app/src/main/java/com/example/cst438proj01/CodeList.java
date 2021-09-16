package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CodeList {

    // private variables
    @SerializedName("ValidValue")
    private List<ValidValue> validValueList;

    // getters
    public List<ValidValue> getValidValueList() {
        return validValueList;
    }

    // setters
    public void setValidValueList(List<ValidValue> validValueList) {
        this.validValueList = validValueList;
    }
}
