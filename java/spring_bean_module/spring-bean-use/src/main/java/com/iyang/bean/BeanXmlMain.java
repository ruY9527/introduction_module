package com.iyang.bean;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author Yang
 * @date 2020/8/11 / 11:49
 *
 *  基于xml读取bean的配置信息
 */
public class BeanXmlMain {

    /**
     * [beanOne]
     *
     * @param args
     */
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

    }


}
