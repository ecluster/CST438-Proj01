package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * CodeList --- program to represent a Code List for HirePath".
 * @author    Edward Cluster
 */

public class CodeList {

    // private variables
    @SerializedName("ValidValue")
    private List<ValidValue> validValueList;

    // getters
    /**
     * Get a list of valid values for CodeList
     * @return List<ValidValue>
     */
    public List<ValidValue> getValidValueList() {
        return validValueList;
    }

    // setters
    /**
     * Set the list of valid values for CodeList
     * @param validValueList An array list of ValidValue
     */
    public void setValidValueList(List<ValidValue> validValueList) {
        this.validValueList = validValueList;
    }
}
