package com.linkedin.mod4.challenges.three;

public class EmployeeInfoService {
    public static void showEmployeeInfo(Employee employee) {
        System.out.println(employee.getGrossPayment());
        System.out.println(employee.getTaxes());
        System.out.println(employee.getNetPay());
    }
}
