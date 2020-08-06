package com.iyang.design.modle.java8.streams;

import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @author Yang
 * @date 2020/8/7 / 0:20
 */
public class CalculatePractice {

    public static void main(String[] args) {

        List<User> userList = User.getUserList();
        IntSummaryStatistics intSummaryStatistics = userList.stream().mapToInt(user -> user.getAge()).summaryStatistics();
        System.out.println(intSummaryStatistics.getCount() + " : 总共的个数");
        System.out.println(intSummaryStatistics.getAverage() + " : 平均年龄");
        System.out.println(intSummaryStatistics.getMax() + " : 最大年龄");
        System.out.println(intSummaryStatistics.getMin() + " : 最小的年龄");
        System.out.println(intSummaryStatistics.getSum() + " : 总共之和");

    }

}
