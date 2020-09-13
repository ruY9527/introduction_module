package com.iyang.learn.lambdas;

import com.iyang.learn.pojo.Employee;

/**
 * Created by Yang on 2020/9/14 0:21
 */

public class FilterEmployeeForAge implements MyPredicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        return employee.getAge() < 35;
    }
}
