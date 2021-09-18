package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * HirePath --- program to represent a Hiring Path".
 * @author    Edward Cluster
 */

public class HirePath {

    // private variables
    @SerializedName("CodeList")
    private List<CodeList> codeLists;
    private String hirePathCode;
    private String hirePathValue;

    // getters
    /**
     * Get a list of CodeList from Json response
     * @return List<CodeList>
     */
    public List<CodeList> getCodeLists() {
        return codeLists;
    }
    /**
     * Get the hiring path code from a job
     * @param i An int to iterate through
     * an array of ValidValuesList
     * @return String
     */
    public String getHirePathCode (int i) {
        return codeLists.get(0).getValidValueList().get(i).getCode();
    }
    /**
     * Get the hiring path value from a job
     * @param i An int to iterate through
     * an array of ValidValuesList
     * @return String
     */
    public String getHirePathValue (int i) {
        return codeLists.get(0).getValidValueList().get(i).getValue();
    }

    // setters
    /**
     * Set the list of codes for a HirePath
     * @param codeLists An array list of CodeList
     */
    public void setCodeLists(List<CodeList> codeLists) {
        this.codeLists = codeLists;
    }
    public void setHirePathCode(String hirePathCode) {
        this.hirePathCode = hirePathCode;
    }
    public void setHirePathValue(String hirePathValue) {
        this.hirePathValue = hirePathValue;
    }
}
