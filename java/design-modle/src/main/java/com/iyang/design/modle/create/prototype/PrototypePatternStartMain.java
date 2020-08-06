package com.iyang.design.modle.create.prototype;

import com.iyang.design.modle.create.factory.simple.Shape;

/**
 * @author Yang
 * @date 2020/8/6 / 20:17
 */
public class PrototypePatternStartMain {

    public static void main(String[] args) {

        // 缓冲数据
        ShapeCache.loadCache();

        ShapePrototype shape = ShapeCache.getShape("1");
        System.out.println("Shape : " + shape.getType());

        ShapePrototype shapeTwo = ShapeCache.getShape("2");
        System.out.printf("ShapeTwo : " + shapeTwo.getType());

        ShapePrototype shapeThree = ShapeCache.getShape("3");
        System.out.println("ShapeThree : " + shapeThree.getType());

    }

}
