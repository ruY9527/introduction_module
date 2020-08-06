package com.iyang.design.modle.java8.streams;

import java.util.List;

/**
 * @author Yang
 * @date 2020/8/7 / 0:29
 *
 * Reduce模块的练习
 */
public class ReducePractice {

    public static void main(String[] args) {

        List<User> userList = User.getUserList();
        Integer reduce = userList.stream()
                         .reduce(0, (integer, user) -> integer + user.getAge(), (integer, integer2) -> integer + integer2);
        System.out.println(reduce);

    }

}
