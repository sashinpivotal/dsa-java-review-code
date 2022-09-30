package com.hr.persponnel.client;

import com.hr.persponnel.Department;
import com.hr.persponnel.Employee;
import com.hr.persponnel.HourlyEmployee;
import com.hr.persponnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {

    public static void main(String[] args) {

        Employee employee1 = new SalariedEmployee("joe", LocalDate.of(2010, 12, 12));
        String employeeInfo1 = employee1.getEmployeeInfo();
        System.out.println(employeeInfo1);

        Employee employee2 = new SalariedEmployee("maria", LocalDate.of(2020, 02, 12));
        String employeeInfo2 = employee2.getEmployeeInfo();
        System.out.println(employeeInfo2);

        Employee employee3 = new HourlyEmployee("dave", LocalDate.of(2021, 03, 23));
        String employeeInfo3 = employee3.getEmployeeInfo();
        System.out.println(employeeInfo3);

        Department department = new Department("marketing", "boston");
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);
        int numberOfEmployeesWhoWorked
                = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println("number of employees who worked = " +
                numberOfEmployeesWhoWorked);
    }
}
