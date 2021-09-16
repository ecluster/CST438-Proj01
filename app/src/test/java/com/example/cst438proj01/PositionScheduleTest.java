package com.example.cst438proj01;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PositionScheduleTest {

    @Test
    public void getPositionScheduleCode() {
        int i = 0;
        ValidValue validValue = new ValidValue();
        validValue.setCode("test1");

        CodeList codeList = new CodeList();
        List<ValidValue> validValueList = new ArrayList<>();
        validValueList.add(validValue);
        codeList.setValidValueList(validValueList);

        PositionSchedule positionSchedule = new PositionSchedule();
        List<CodeList> codeArrayList = new ArrayList<>();
        codeArrayList.add(codeList);
        positionSchedule.setCodeLists(codeArrayList);

        assertEquals("test1", positionSchedule.getPositionScheduleCode(i));
    }

    @Test
    public void getPositionScheduleValue() {
        int i = 0;
        ValidValue validValue = new ValidValue();
        validValue.setValue("test1");

        CodeList codeList = new CodeList();
        List<ValidValue> validValueList = new ArrayList<>();
        validValueList.add(validValue);
        codeList.setValidValueList(validValueList);

        PositionSchedule positionSchedule = new PositionSchedule();
        List<CodeList> codeArrayList = new ArrayList<>();
        codeArrayList.add(codeList);
        positionSchedule.setCodeLists(codeArrayList);

        assertEquals("test1", positionSchedule.getPositionScheduleValue(i));
    }

    @Test
    public void setPositionScheduleCode() {
        String positionScheduleCode = "test";
        PositionSchedule positionSchedule = new PositionSchedule();
        positionSchedule.setPositionScheduleCode(positionScheduleCode);
    }

    @Test
    public void setPositionScheduleValue() {
        String positionScheduleValue = "test";
        PositionSchedule positionSchedule = new PositionSchedule();
        positionSchedule.setPositionScheduleValue(positionScheduleValue);
    }
}
