package com.hr.persponnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private double hourlyRate;
    private int hoursWorkedPerMonth;

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double hourlyRate, int hoursWorkedPerMonth) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }

}
