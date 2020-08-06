package com.iyang.design.modle.java8.streams;

import java.util.List;

/**
 * @author Yang
 * @date 2020/8/6 / 23:57
 *
 * 使用 foreach 来进行迭代数据
 */
public class ForeachPractice {

    public static void main(String[] args) {

        List<User> userList = User.getUserList();
        userList.stream().forEach(user -> System.out.println(user));

    }

}
