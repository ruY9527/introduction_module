package com.iyang.bean.filters;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author Yang
 * @date 2020/8/11 / 12:10
 */

public class YangCustomFilter implements TypeFilter {

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类的注解.
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        // 获取当前类的class信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        // 获取当前类的资源信息
        Resource metadataReaderResource = metadataReader.getResource();
        if(classMetadata.getClassName().contains("dao")){
            return true;
        }
        return false;
    }

}
