package com.hr.personnel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DepartmentUsingArrayTest {

    private Department department;

    @BeforeEach
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
        int currentIndex = department.getCurrentIndex();

        // assert
        Assertions.assertEquals(2, currentIndex);
    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked_should_return_correct_value() {

        int numberOfEmployeesWhoWorked
                = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        Assertions.assertEquals(2, numberOfEmployeesWhoWorked);

    }

    @Test
    public void computeDepartmentMonthlyTotalCompensation_should_return_total_monthly_compensation() {
        department.addEmployee(new HourlyEmployee("paul",
                LocalDate.of(2020, 1, 23),
                10.0, 100));
        double monthlyTotalCompensation = department.computeDepartmentMonthlyTotalCompensation();
        Assertions.assertEquals(6000.0, monthlyTotalCompensation, 0.01);
    }
}