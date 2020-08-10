package com.iyang.design.modle.structure.bridge;

/**
 * @author Yang
 * @date 2020/8/7 / 1:17
 */

public class Circle extends AbShape {

    private int x, y, radius;

    public Circle( int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }


}
