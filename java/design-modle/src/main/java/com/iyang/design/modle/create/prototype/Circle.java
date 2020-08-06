package com.iyang.design.modle.create.prototype;

/**
 * @author Yang
 * @date 2020/8/6 / 20:13
 */
public class Circle extends ShapePrototype {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("draw 方法调用在Circle中");
    }
}
