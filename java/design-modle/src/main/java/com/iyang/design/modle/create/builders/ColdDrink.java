package com.iyang.design.modle.create.builders;

/**
 * @author Yang
 * @date 2020/8/6 / 19:25
 */

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
