package com.sb.protobuf;

import com.sb.model.Employee;

public class DefaultValueDemo {
    public static void main(String[] args) {

        Employee employee = Employee.newBuilder().build();
        // There is no null in Proto buffer
        System.out.println(
                "City :" + employee.getAddress().getCity()
        );

        System.out.println(
                employee.hasAddress()
        );

    }
}
