package com.hr.persponnel;

public class DepartmentUsingArray {

    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public DepartmentUsingArray(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex] = employee;
        currentIndex++;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numberOfEmployeesWhoWorked = 0;

        for (int i = 0; i < currentIndex  ; i++){
            if (employees[i].work().contains("worked")) {
                numberOfEmployeesWhoWorked++;
            }
        }
        return numberOfEmployeesWhoWorked;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    // Compute total monthly compensation of all
    // employees in that department
    public double computeDepartmentMonthlyTotalCompensation() {
        double monthlyTotalCompensation = 0.0;

        for (int i = 0; i < currentIndex; i++) {
            monthlyTotalCompensation += employees[i].computeMonthlyCompensation();
        }

        return monthlyTotalCompensation;
    }
}
