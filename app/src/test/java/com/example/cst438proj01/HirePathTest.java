package com.example.cst438proj01;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HirePathTest {

    @Test
    public void getHirePathValue () {
        int i = 0;
        ValidValue validValue = new ValidValue();
        validValue.setValue("test1");

        CodeList codeList = new CodeList();
        List<ValidValue> validValueList = new ArrayList<>();
        validValueList.add(validValue);
        codeList.setValidValueList(validValueList);

        HirePath hirePath = new HirePath();
        List<CodeList> codeArrayList = new ArrayList<>();
        codeArrayList.add(codeList);
        hirePath.setCodeLists(codeArrayList);

        assertEquals("test1", hirePath.getHirePathValue(i));
    }

    @Test
    public void getHirePathCode () {
        int i = 0;
        ValidValue validValue = new ValidValue();
        validValue.setCode("test1");

        CodeList codeList = new CodeList();
        List<ValidValue> validValueList = new ArrayList<>();
        validValueList.add(validValue);
        codeList.setValidValueList(validValueList);

        HirePath hirePath = new HirePath();
        List<CodeList> codeArrayList = new ArrayList<>();
        codeArrayList.add(codeList);
        hirePath.setCodeLists(codeArrayList);

        assertEquals("test1", hirePath.getHirePathCode(i));
    }

    @Test
    public void setHirePathCode() {
        String hirePathCode = "test";
        HirePath hirePath = new HirePath();
        hirePath.setHirePathCode(hirePathCode);
    }

    @Test
    public void setHirePathValue() {
        String hirePathValue = "test";
        HirePath hirePath = new HirePath();
        hirePath.setHirePathValue(hirePathValue);
    }
}
