package com.iyang.design.modle.create.factory.simple.obj;

import com.iyang.design.modle.create.factory.simple.Shape;
import org.springframework.stereotype.Service;

/**
 * @author Yang
 * @date 2020/8/6 / 14:12
 */

@Service
public class Square implements Shape {

    @Override
    public void draw() {
         System.out.println("Square 中调用 draw 方法");
     }

}
