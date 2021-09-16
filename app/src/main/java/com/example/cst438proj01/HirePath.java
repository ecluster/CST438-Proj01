package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HirePath {

    // private variables
    @SerializedName("CodeList")
    private List<CodeList> codeLists;
    private String hirePathCode;
    private String hirePathValue;

    // getters
    public List<CodeList> getCodeLists() {
        return codeLists;
    }
    public String getHirePathCode (int i) {
        return codeLists.get(0).getValidValueList().get(i).getCode();
    }
    public String getHirePathValue (int i) {
        return codeLists.get(0).getValidValueList().get(i).getValue();
    }

    // setters
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
