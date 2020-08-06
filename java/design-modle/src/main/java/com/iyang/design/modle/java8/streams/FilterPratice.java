package com.iyang.design.modle.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yang
 * @date 2020/8/7 / 0:02
 *
 * 使用  filter 来进行过滤操作
 */
public class FilterPratice {

    public static void main(String[] args) {

        List<User> userList = User.getUserList();
        List<User> users = userList.stream().filter(user -> user.getAge() < 50).collect(Collectors.toList());
        System.out.println(users);

    }

}
