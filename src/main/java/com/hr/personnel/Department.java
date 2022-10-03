package com.hr.personnel;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private String location;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numberOfEmployeesWhoWorked = 0;

        for (Employee employee : employees) {
            if (employee.work().contains("worked")) {
                numberOfEmployeesWhoWorked++;
            }
        }
        return numberOfEmployeesWhoWorked;
    }

    // Compute total monthly compensation of all
    // employees in that department
    public double computeDepartmentMonthlyTotalCompensation() {
        double monthlyTotalCompensation = 0.0;

        for (Employee employee: employees) {
            monthlyTotalCompensation += employee.computeMonthlyCompensation();
        }

        return monthlyTotalCompensation;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
