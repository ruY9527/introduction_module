package com.iyang.design.modle.create.prototype;

import com.iyang.design.modle.create.factory.simple.Shape;

import java.util.Hashtable;

/**
 * @author Yang
 * @date 2020/8/6 / 20:14
 */
public class ShapeCache {

    private static Hashtable<String, ShapePrototype> shepeMap = new Hashtable<>();

    public static ShapePrototype getShape(String shapeId){
        ShapePrototype shape = shepeMap.get(shapeId);
        return (ShapePrototype) shape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shepeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shepeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shepeMap.put(rectangle.getId(),rectangle);

    }


}
