package com.iyang.design.modle.create.factory.simple;

/**
 * @author Yang
 * @date 2020/8/6 / 14:10
 *
 *  定义一个接口
 */
public interface Shape {

    void draw();

    default String shape(){
        return "这就是默认的形状";
    }

}
