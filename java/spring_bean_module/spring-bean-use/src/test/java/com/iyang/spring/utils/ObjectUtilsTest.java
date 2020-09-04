package com.iyang.spring.utils;

import org.junit.Test;
import org.springframework.util.ObjectUtils;

/**
 * @author Yang
 * @date 2020/8/12 / 14:59
 *
 *  Spring 中一些工具类的测试使用
 *
 */


public class ObjectUtilsTest {


    @Test
    public void identityToStringTest(){

        /**
         *  Result : java.lang.String@2530c12
         *           java.lang.String@73c6c3b2
         *          二者的结果不一样
         */
        String identityO = ObjectUtils.identityToString("123");
        String identityT = ObjectUtils.identityToString(new String("123"));

        System.out.println(identityO);
        System.out.println(identityT);
    }


}
