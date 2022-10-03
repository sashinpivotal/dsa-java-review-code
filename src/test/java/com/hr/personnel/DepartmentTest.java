package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class DepartmentTest {

    private Department department;

    @Before
    public void setUp() throws Exception {
        department = new Department("marketing", "boston");

        department.addEmployee(new SalariedEmployee("sang",
                LocalDate.of(2020, 01,03), 2000.0));

        department.addEmployee(new SalariedEmployee("dave",
                LocalDate.of(2025, 01,03), 3000.0));
    }

    @Test
    public void addEmployee_should_add_an_employee_correctly() {

        // arrange

        // act
        int numberOfEmployeesInDepartment = department.getEmployees().size();

        // assert
        Assert.assertEquals(2, numberOfEmployeesInDepartment);
    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked_should_return_correct_value() {

        int numberOfEmployeesWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        Assert.assertEquals(2, numberOfEmployeesWhoWorked);

    }

    @Test
    public void computeDepartmentMonthlyTotalCompensation_should_return_total_monthly_compensation() {
        department.addEmployee(new HourlyEmployee("paul",
                LocalDate.of(2020, 1, 23),
                10.0, 100));
        double monthlyTotalCompensation = department.computeDepartmentMonthlyTotalCompensation();
        Assert.assertEquals(6000.0, monthlyTotalCompensation, 0.01);
    }
}