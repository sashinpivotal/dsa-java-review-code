package com.hr.persponnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {

    private Department department;

    @Before
    public void setUp() throws Exception {
        department = new Department("marketing", "boston");

        department.addEmployee(new SalariedEmployee("sang",
                LocalDate.of(2020, 01,03)));

        department.addEmployee(new SalariedEmployee("dave",
                LocalDate.of(2025, 01,03)));
    }

    @Test
    public void addEmployee_should_add_an_employee_correctly() {

        // arrange

        // act
        int currentIndex = department.getCurrentIndex();

        // assert
        Assert.assertEquals(2, currentIndex);
    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked_should_return_correct_value() {

        int numberOfEmployeesWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        Assert.assertEquals(2, numberOfEmployeesWhoWorked);

    }
}