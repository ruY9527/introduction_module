package com.iyang.design.modle.structure.decorator;

import com.iyang.design.modle.create.prototype.Rectangle;

/**
 * @author Yang
 * @date 2020/8/7 / 19:08
 */
public class DecoratorPatternStartMain {

    public static void main(String[] args) {

        DShape circle = new DCircle();
        ShapeDecorator redCircle = new RedShapeDecorator(new DCircle());
        ShapeDecorator redRectabgle = new RedShapeDecorator(new DRectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectabgle.draw();

    }

}
