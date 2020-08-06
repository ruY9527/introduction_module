package com.iyang.design.modle.create.factory.simple.obj;

import com.iyang.design.modle.create.factory.simple.Shape;
import org.springframework.stereotype.Service;

/**
 * @author Yang
 * @date 2020/8/6 / 14:11
 */

@Service
public class Rectangle implements Shape {

    @Override
    public void draw() {

        System.out.println("Rectangle 中的 draw 方法调用打印语句");
    }

}
