package com.iyang.design.modle.structure.bridge;


/**
 * @author Yang
 * @date 2020/8/7 / 1:19
 */
public class BridgePatternStartMain {

    public static void main(String[] args) {

        AbShape redCircle = new Circle(100,100, 10, new RedCircle());
        AbShape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }

}
