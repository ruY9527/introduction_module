package com.iyang.design.modle.create.builders;

/**
 * @author Yang
 * @date 2020/8/6 / 19:40
 *
 * Meal 建造者, 其内部实现的方法.
 */
public class MealBuilder {

    /**
     * 这个地方也是可以传递参数进来的.
     * 对参数进行解析等处理操作.
     * @return
     */
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
