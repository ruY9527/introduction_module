package com.iyang.design.modle.create.builders;

/**
 * @author Yang
 * @date 2020/8/6 / 19:28
 */

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
