package com.iyang.design.modle.create.builders;

/**
 * @author Yang
 * @date 2020/8/6 / 19:27
 */


public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
