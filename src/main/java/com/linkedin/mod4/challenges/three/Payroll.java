package com.linkedin.mod4.challenges.three;

// We have a legacy payroll application with a Payroll class that
// calculates the salaries of employees. The class has grown too large
// and violates the Single Responsibility Principle. We need to
// refactor and split the class up into different responsibilities.
// To refactor the code, we extract the different responsibilities
// into separate classes. We could create EmployeeService,
// PayrollCalculator, TaxCalculator, PayrollSaver, and PayStub.
// We can also add in an interface called PayrollProcessor,
// to represent the process of processing payroll and implement it
// in the PayrollService class.

import java.util.List;

public class Payroll {

    private final List<Employee> employees;

    public Payroll(List<Employee> employees) {
        this.employees = employees;
    }

    public void calculateSalaries() {
        employees.forEach(EmployeeInfoService::showEmployeeInfo);
        employees.forEach(PayStubService::pay);
    }
}

