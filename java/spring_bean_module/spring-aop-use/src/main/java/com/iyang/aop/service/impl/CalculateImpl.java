package com.iyang.aop.service.impl;

import com.iyang.aop.service.Calculate;

/**
 * @author Yang
 * @date 2020/8/12 / 15:10
 */


public class CalculateImpl implements Calculate {

    public int add(int numA, int numB) {
        return numA + numB;
    }

}
