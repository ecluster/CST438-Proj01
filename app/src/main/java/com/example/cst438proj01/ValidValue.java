package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

public class ValidValue {

    // private variables
    @SerializedName("Code")
    private String code;
    @SerializedName("Value")
    private String value;

    // getters
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    // setters
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
