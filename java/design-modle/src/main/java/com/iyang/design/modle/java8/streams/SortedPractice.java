package com.iyang.design.modle.java8.streams;

import java.util.Comparator;
import java.util.List;

/**
 * @author Yang
 * @date 2020/8/6 / 23:59
 * 使用  sorted 来进行排序.
 * reversed 是使用的倒叙,默认是正序排序的
 */
public class SortedPractice {

    public static void main(String[] args) {

        List<User> userList = User.getUserList();
        userList.sort(Comparator.comparing(User::getAge).reversed());
        System.out.println(userList);

    }

}
