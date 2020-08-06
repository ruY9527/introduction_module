package com.iyang.design.modle.create.factory.simple;

/**
 * @author Yang
 * @date 2020/8/6 / 15:20
 *
 *  基于普通的new对象操作.
 *
 */
public class FactoryPatternStartMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();

        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        shapeRectangle.draw();

        Shape squareSquare = shapeFactory.getShape("SQUARE");
        squareSquare.draw();

    }


}
