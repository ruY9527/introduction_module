package com.iyang.design.modle.structure.decorator;

/**
 * @author Yang
 * @date 2020/8/7 / 19:06
 */

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(DShape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw(){

        decoratorShape.draw();
        setRedBorder(decoratorShape);

    }

    protected void setRedBorder(DShape decoratedShape){
        System.out.println("Border Color: Red");
    }

}
