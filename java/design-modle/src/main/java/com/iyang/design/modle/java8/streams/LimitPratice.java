package com.iyang.design.modle.java8.streams;

import java.util.List;

/**
 * @author Yang
 * @date 2020/8/7 / 0:05
 */
public class LimitPratice {

    /**
     * 这里从 0 到 3  , 不包含下标是 3 的那个数据
     * @param args
     */
    public static void main(String[] args) {

        List<User> userList = User.getUserList();
        userList.stream().limit(3).forEach(user -> System.out.println(user));


    }

}
