package com.iyang.design.modle.create.builders;

/**
 * @author Yang
 * @date 2020/8/6 / 19:27
 */

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
