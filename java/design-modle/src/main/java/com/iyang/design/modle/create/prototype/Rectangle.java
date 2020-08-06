package com.iyang.design.modle.create.prototype;

/**
 * @author Yang
 * @date 2020/8/6 / 20:11
 */

public class Rectangle extends ShapePrototype {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("draw 方法在 Rectangle中");
    }
}
