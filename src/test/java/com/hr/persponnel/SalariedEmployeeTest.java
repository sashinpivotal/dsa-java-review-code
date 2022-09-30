package com.hr.persponnel;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    @Test
    public void computeMonthlyCompensation_returns_monthly_salary() {

        SalariedEmployee sang = new SalariedEmployee("sang",
                LocalDate.of(2020, 05, 23),
                1000.0);
        Assert.assertEquals(sang.computeMonthlyCompensation(), 1000.0, 0.01);
    }
}