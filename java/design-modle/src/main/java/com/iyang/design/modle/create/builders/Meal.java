package com.iyang.design.modle.create.builders;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yang
 * @date 2020/8/6 / 19:29
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
         return items.stream().reduce(0f,(aFloat, item) -> aFloat + item.price(),(aFloat, aFloat2) -> aFloat + aFloat2);
    }

    public void showItems(){
        items.forEach(item -> {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        });
    }
}
