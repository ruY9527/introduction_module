package com.iyang.design.modle.structure.decorator;

/**
 * @author Yang
 * @date 2020/8/7 / 19:03
 */
public class DRectangle implements DShape {

    @Override
    public void draw() {
        System.out.println("DRectangle in DShape Clazz Info");
    }

}
