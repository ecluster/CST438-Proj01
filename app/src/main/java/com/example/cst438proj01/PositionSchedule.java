package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * PositionSchedule --- program to represent a schedule of a position
 * @author    Edward Cluster
 */

public class PositionSchedule {

    // private variables
    @SerializedName("CodeList")
    private List<CodeList> codeLists;
    private String positionScheduleCode;
    private String positionScheduleValue;

    // getters
    /**
     * get a list of codes for PositionSchedule
     * @return List<CodeList>
     */
    public List<CodeList> getCodeLists() {
        return codeLists;
    }

    /**
     * get the schedule code for a position
     * @param i An int to interate through
     * a list of ValidValueList
     * @return String
     */
    public String getPositionScheduleCode(int i) {
        return codeLists.get(0).getValidValueList().get(i).getCode();
    }
    /**
     * get the schedule value for a position
     * @param i An int to interate through
     * a list of ValidValueList
     * @return String
     */
    public String getPositionScheduleValue(int i) {
        return codeLists.get(0).getValidValueList().get(i).getValue();
    }

    // setters

    /**
     * set the lists of codes for PositionSchedule
     * @param codeLists
     */
    public void setCodeLists(List<CodeList> codeLists) {
        this.codeLists = codeLists;
    }

    /**
     * set the schedule code for PositionSchedule
     * @param positionScheduleCode
     */
    public void setPositionScheduleCode(String positionScheduleCode) {
        this.positionScheduleCode = positionScheduleCode;
    }

    /**
     * set the schedule value for PositionSchedule
     * @param positionScheduleValue
     */
    public void setPositionScheduleValue(String positionScheduleValue) {
        this.positionScheduleValue = positionScheduleValue;
    }
}
