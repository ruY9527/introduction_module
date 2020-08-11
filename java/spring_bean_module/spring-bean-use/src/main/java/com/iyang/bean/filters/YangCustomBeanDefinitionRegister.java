package com.iyang.bean.filters;

import com.iyang.bean.pojo.BeanOne;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Yang
 * @date 2020/8/11 / 12:25
 */

public class YangCustomBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        // 定义一个bd. 也就是创建一个 bean 定义对象
        RootBeanDefinition rbd = new RootBeanDefinition(BeanOne.class);
        // 把 bean 定义对象导入到容器中. 这里后文打印的beanName的值也就是 beanOne了.
        registry.registerBeanDefinition("beanOne",rbd);

    }

}
