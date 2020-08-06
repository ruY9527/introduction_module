package com.iyang.design.modle.java8.streams;

import java.util.List;

/**
 * @author Yang
 * @date 2020/8/7 / 0:06
 */
public class SkipPractice {

    /**
     * 从下标三开始获取打印出数据
     * 与 limit 效果是恰好相反的
     * @param args
     */
    public static void main(String[] args) {

        List<User> userList = User.getUserList();
        userList.stream().skip(3).forEach(user -> System.out.println(user));

    }
    
}
