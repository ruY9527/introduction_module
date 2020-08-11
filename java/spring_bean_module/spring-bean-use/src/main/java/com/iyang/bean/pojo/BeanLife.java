package com.iyang.bean.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Yang
 * @date 2020/8/11 / 14:35
 *
 * 关于Bean的生活周期Coding. Bean的创建 ---> 初始化 ---> 销毁方法.由容器管理bean的生命周期,
 * 我们可以通过自己指定bean的初始化方法和bean的销毁方法.
 *
 *  单例bean的话,容器启动的时候,bean的对象就创建了,而且容器销毁的时候,也会调用bean的销毁方法.
 *  针对多实例bean的话,容器启动的时候,bean是不会被创建而是在获取bean的时候被创建,而且bean的销毁不受IOC容器管理.
 *
 */

@Component
// 指定外部文件的位置
// @PropertySource(value = { "classpath:person.properties" })
public class BeanLife implements InitializingBean, DisposableBean , BeanPostProcessor {

    @Value("GavinYang")
    private String name;

    @Value("#{28-8}")
    private Integer age;

    @PostConstruct
    public void init(){
        System.out.println("BeanLife 中调用 init()方法");
    }

    public void destroy() throws Exception {
        System.out.println("BeanLife 中调用 destroy()方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLife 中调用 afterPropertiesSet()方法");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanLife 中调用 postProcessBeforeInitialization()方法");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanLife 中调用 postProcessAfterInitialization()方法");
        return bean;
    }
}
