package com.iyang.design.modle.structure.decorator;


/**
 * @author Yang
 * @date 2020/8/7 / 19:05
 */


public abstract class ShapeDecorator {

    public DShape decoratorShape;

    public ShapeDecorator(DShape decoratorShape){
        this.decoratorShape = decoratorShape;
    }

    public void draw(){
        decoratorShape.draw();
    }


}
