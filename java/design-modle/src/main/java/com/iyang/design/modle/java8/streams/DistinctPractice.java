package com.iyang.design.modle.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yang
 * @date 2020/8/7 / 0:08
 *
 *  使用 distinct 需要重写对象的 hashCode / equals 方法的
 */
public class DistinctPractice {

    public static void main(String[] args) {

        List<User> userList = User.getUserList();
        List<User> users = new ArrayList<>(userList);
        users.stream().distinct().forEach(user -> System.out.println(user));

        System.out.println("  华丽分割线  ");
        //  组合条件进行操作
        userList.stream().distinct().filter(user -> user.getAge() > 40)
                .sorted(Comparator.comparing(User::getAge)).limit(2).forEach(user -> System.out.println(user));

    }

}
