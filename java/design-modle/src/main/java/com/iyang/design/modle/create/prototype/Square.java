package com.iyang.design.modle.create.prototype;

/**
 * @author Yang
 * @date 2020/8/6 / 20:12
 */


public class Square extends ShapePrototype {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {

        System.out.println("调用 draw 在Square中");

    }
}
