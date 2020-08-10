package com.iyang.design.modle.structure.decorator;

/**
 * @author Yang
 * @date 2020/8/7 / 19:04
 */
public class DCircle implements DShape {

    @Override
    public void draw() {
        System.out.println("DCircle in DShape clazz info");
    }

}
