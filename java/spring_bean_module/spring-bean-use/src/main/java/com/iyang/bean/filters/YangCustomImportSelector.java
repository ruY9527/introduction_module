package com.iyang.bean.filters;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Yang
 * @date 2020/8/11 / 12:21
 */
public class YangCustomImportSelector implements ImportSelector {

    /**
     *  获取导入类的注解信息.
     *  导入进来的话,打印出来的 beanNames 的值也是: com.iyang.bean.pojo.BeanOne(全限定类名)
     * @param importingClassMetadata
     * @return
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{ "com.iyang.bean.pojo.BeanOne" };
    }

}
