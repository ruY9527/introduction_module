package com.iyang.design.modle.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author Yang
 * @date 2020/8/7 / 0:23
 *
 * stream 中的 map 使用练习
 */
public class MapPractice {

    public static void main(String[] args) {

        List<User> userList = User.getUserList();
        userList.stream().forEach(user -> System.out.println(user));
        List<Integer> ageList = userList.stream().map(user -> user.getAge()).collect(toList());
        Set<Integer> ageSet = userList.stream().map(user -> user.getAge()).collect(Collectors.toSet());

        System.out.println(ageList);
        System.out.println(ageSet);

        List<String> words = Arrays.asList("aaa", "vvvv", "cccc");
        List<String> upperWordsList = words.stream().map(s -> s.toUpperCase()).collect(toList());
        System.out.println(upperWordsList);

        System.out.println("分割线");
        System.out.println(userList.stream().findFirst().get());

    }


}


