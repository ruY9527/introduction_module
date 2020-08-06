package com.iyang.design.modle.utils;

import com.iyang.design.modle.create.factory.simple.Shape;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Yang
 * @date 2020/8/6 / 15:46
 *
 * 实现 ApplicationContextAware 接口, 并且实现了 setApplicationContext 方法,就可以获取到 applicationContext
 * 可以不用注入,根据传入进来的 beanName 来获取对应的bean 的 Object对象
 *
 */

@Component
public class SimpleFactroyApplicationUtils implements ApplicationContextAware , InitializingBean  {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 根据 beanName 来获取 bean 信息.
     * 如果没有获取到的话,那么就返回 null 出去.
     * @param beanName
     * @return
     */
    public static Shape getBeanInfo(String beanName){
        Object bean = applicationContext.getBean(beanName);
        if(bean instanceof Shape){
            return (Shape) bean;
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        Map<String, Shape> shapeMap = applicationContext.getBeansOfType(Shape.class);
        shapeMap.forEach((k,v) -> {
            v.draw();
        });

    }


}
