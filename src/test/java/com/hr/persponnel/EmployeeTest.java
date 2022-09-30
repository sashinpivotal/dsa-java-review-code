package com.hr.persponnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getEmployeeInfo_should_return_valid_info() {

        // arrange
        Employee sang = new Employee("sang", LocalDate.of(2020, 03, 02));

        // act
        String employeeInfo = sang.getEmployeeInfo();

        // assert
        Assert.assertEquals("name = sang, hireDate = 2020-03-02", employeeInfo);

    }
}