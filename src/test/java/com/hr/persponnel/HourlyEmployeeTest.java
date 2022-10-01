package com.hr.persponnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    private HourlyEmployee employee;

    @Before
    public void setUp() throws Exception {
        employee = new HourlyEmployee("sang",
                LocalDate.of(2020, 03, 23),
                10.0,
                200);
    }

    @Test
    public void computeMonthlyCompensation_should_return_valid_result() {
        assertEquals(employee.computeMonthlyCompensation(), 2000.0, 0.01);
    }

    @Test
    public void getEmployeeInfo_should_return_valid_info_on_SalariedEmployee() {

        assertEquals("name = sang, hireDate = 2020-03-23, hourlyRate = 10.0, hoursWorkedPerMonth = 200",
                employee.getEmployeeInfo());
    }

    @Test
    public void computeMonthlyTaxToPay_should_compute_tax_correctly() {
        double monthlyTaxToPay = employee.computeMonthlyTaxToPay();
        assertEquals(250.0, monthlyTaxToPay, 0.01);
    }

    @Test
    public void computeMonthlyTaxToPay_should_return_0_tax_value_when_tax_to_pay_is_less_than_default_deduction() {
        employee = new HourlyEmployee("sang",
                LocalDate.of(2020, 03, 23),
                10.0,
                20);
        double monthlyTaxToPay = employee.computeMonthlyTaxToPay();
        assertEquals(0.0, monthlyTaxToPay, 0.01);
    }
}