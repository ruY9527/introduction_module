package com.iyang.design.modle.structure.bridge;

/**
 * @author Yang
 * @date 2020/8/7 / 1:15
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }

}
