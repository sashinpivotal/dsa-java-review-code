package com.hr.persponnel;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    @Test
    public void computeMonthlyCompensation_should_return_valid_result() {

        HourlyEmployee sang = new HourlyEmployee("sang",
                LocalDate.of(2020, 03, 23),
                10.0,
                200);
        Assert.assertEquals(sang.computeMonthlyCompensation(), 2000.0, 0.01);
    }
}