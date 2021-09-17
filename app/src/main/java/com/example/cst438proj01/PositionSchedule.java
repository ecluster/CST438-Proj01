package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PositionSchedule {

    // private variables
    @SerializedName("CodeList")
    private List<CodeList> codeLists;
    private String positionScheduleCode;
    private String positionScheduleValue;

    // getters
    public List<CodeList> getCodeLists() {
        return codeLists;
    }
    public String getPositionScheduleCode(int i) {
        return codeLists.get(0).getValidValueList().get(i).getCode();
    }
    public String getPositionScheduleValue(int i) {
        return codeLists.get(0).getValidValueList().get(i).getValue();
    }

    // setters
    public void setCodeLists(List<CodeList> codeLists) {
        this.codeLists = codeLists;
    }
    public void setPositionScheduleCode(String positionScheduleCode) {
        this.positionScheduleCode = positionScheduleCode;
    }
    public void setPositionScheduleValue(String positionScheduleValue) {
        this.positionScheduleValue = positionScheduleValue;
    }
}
