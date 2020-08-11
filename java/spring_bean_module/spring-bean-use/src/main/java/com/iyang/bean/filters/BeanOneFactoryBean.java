package com.iyang.bean.filters;

import com.iyang.bean.pojo.BeanOne;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author Yang
 * @date 2020/8/11 / 13:01
 *
 * 使用 BeanFactory 注入进来的bean，貌似不能根据bean的名字获取出来,因为打印beanNames的集合没有看到对应的值.....
 */

@Component
public class BeanOneFactoryBean implements FactoryBean<BeanOne> {

    /**
     * 返回 Bean 对象
     * @return
     * @throws Exception
     */
    public BeanOne getObject() throws Exception {
        return new BeanOne();
    }

    /**
     *  返回 bean 的类型
     * @return
     */
    public Class<?> getObjectType() {
        return BeanOne.class;
    }

    /**
     * 是否是单例,默认是单例的.
     * @return
     */
    public boolean isSingleton() {
        return true;
    }
}
