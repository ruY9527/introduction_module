package com.iyang.design.modle.structure.bridge;

/**
 * @author Yang
 * @date 2020/8/7 / 1:16
 */
public abstract class AbShape {

    protected DrawAPI drawAPI;

    protected AbShape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
