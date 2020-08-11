package com.iyang.bean.pojo;

/**
 * @author Yang
 * @date 2020/8/11 / 11:49
 */
public class BeanOne {

    private String name;
    private int age;

    public BeanOne() {
        this.name = "GT";
        this.age = 23;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
