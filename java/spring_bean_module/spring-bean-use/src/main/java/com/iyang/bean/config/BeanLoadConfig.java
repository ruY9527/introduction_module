package com.iyang.bean.config;

import com.iyang.bean.filters.*;
import com.iyang.bean.pojo.BeanOne;
import com.iyang.bean.pojo.BeanTwo;
import com.iyang.bean.pojo.ExcludeBean;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.logging.Filter;

/**
 * @author Yang
 * @date 2020/8/11 / 11:56
 *
 * 基于配置类形式读取出bean.
 * 配置类自身也会是一个bean信息
 * 定义 ComponentScan 来进行包扫描的范围, excludeFilters 排除用法.这里是排除了 @Controller 这个注解的. 排除 ExcludeBean.
 *  FilterType: 类型   ANNOTATION: 注解.   ASSIGNABLE_TYPE: 指定类型.    ASPECTJ: aspectJ形式.
 *                     REGEX: 正则表达形式.     CUSTOM: 自定义.
 *
 *
 */

@Configuration
@ComponentScan(basePackages = {"com.iyang.bean.config", "com.iyang.bean.filters"} ,
               excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class}),
                                 @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {ExcludeBean.class}),
                                 @ComponentScan.Filter(type = FilterType.CUSTOM,value = YangCustomFilter.class)})
//  这里导入的话,main里面打印的beanNames的值就是:com.iyang.bean.pojo.BeanOne,也就是全限定类名字.
// @Import(value = { BeanOne.class })
// @Import(value = {YangCustomBeanDefinitionRegister.class})
// @Import(value = {BeanOneFactoryBean.class })
public class BeanLoadConfig {

    /**
     * 如果不进行指定的话,默认bean都是单例的.
     * @return
     */
    @Bean
    public BeanTwo beanTwo(){
        return new BeanTwo();
    }

    /**
     * @return
     *
     * 当容器中有 yangAspect 组件,才会实例化这个 BeanOne 的.
     */
    @Bean
    @Conditional(value = YangCustomCondition.class)
    public BeanOne beanOne(){
        return new BeanOne();
    }


}
