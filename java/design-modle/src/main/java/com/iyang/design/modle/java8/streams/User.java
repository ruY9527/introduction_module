package com.iyang.design.modle.java8.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yang
 * @date 2020/8/6 / 23:55
 */
public class User {

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<User> getUserList(){
        return Arrays.asList(
                // name，age
                new User("张三", 11),
                new User("王五", 20),
                new User("王五", 91),
                new User("张三", 8),
                new User("李四", 44),
                new User("李四", 44),
                new User("李四", 44)
        );
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        // result = 31 * result + (age == null ? 0 : age.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
       // return super.equals(obj) || obj == this;
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj instanceof User){
            User other = (User) obj;
            if(other.name.equalsIgnoreCase(this.name) && other.age == this.age){
                return true;
            }
        }
        return false;
    }
}
