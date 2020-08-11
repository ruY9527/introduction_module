package com.iyang.bean;

import com.iyang.bean.config.BeanLoadConfig;
import com.iyang.bean.pojo.BeanOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author Yang
 * @date 2020/8/11 / 11:58
 *
 * 基于配置类读取出bean信息
 */


public class BeanConfigMain {

    /**
     *
     *
     * [
     * org.springframework.context.annotation.internalConfigurationAnnotationProcessor,
     * org.springframework.context.annotation.internalAutowiredAnnotationProcessor,
     * org.springframework.context.annotation.internalCommonAnnotationProcessor,
     * org.springframework.context.event.internalEventListenerProcessor,
     * org.springframework.context.event.internalEventListenerFactory,
     * beanLoadConfig,
     * beanTwo
     * ]
     * @param args
     */
    public static void main(String[] args) {

        AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext(BeanLoadConfig.class);
        String[] beanDefinitionNames = acp.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        BeanOne beanOne = acp.getBean(BeanOne.class);
        System.out.println(beanOne);

    }

}
