package com.iyang.design.modle.create.builders;

/**
 * @author Yang
 * @date 2020/8/6 / 19:26
 */

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
