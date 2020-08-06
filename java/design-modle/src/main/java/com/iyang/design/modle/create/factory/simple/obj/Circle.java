package com.iyang.design.modle.create.factory.simple.obj;

import com.iyang.design.modle.create.factory.simple.Shape;
import org.springframework.stereotype.Service;

/**
 * @author Yang
 * @date 2020/8/6 / 14:13
 */

@Service
public class Circle implements Shape {


    @Override
    public void draw() {

        System.out.println("Circle 中調用 draw 方法");

    }
}
