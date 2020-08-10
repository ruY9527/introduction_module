package com.iyang.design.modle;

import com.iyang.design.modle.create.factory.simple.Shape;
import com.iyang.design.modle.utils.SimpleFactroyApplicationUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

/**
 *
 * @author yang
 * Java 设计模式的基础 Coding 学习和总和运用使用.
 *
 * 在开发一个项目项目,我们都会弄清楚,开发的这个东西大致需求.
 * 结合这些需求的话,我们就可以使用对应的设计模式来完成我们的代码功能.
 *
 * 1. 创建型模式
 * 2. 结构性模式
 * 3. 行为型模式
 * 4. J2EE模式.
 * 当然了,设计模式这个肯定会随着越来越多的东西,对应的使用也是会越来越多的.
 * 主要是先学习理解这个设计模式的好处,然后在学习在工作中对其进行使用
 *
 */



@SpringBootApplication
public class DesignModleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DesignModleApplication.class, args);

        // String[] namesForType = applicationContext.getBeanNamesForType(Shape.class);
       /* Map<String, Shape> beansOfType = applicationContext.getBeansOfType(Shape.class);
        beansOfType.forEach((k,v) -> {
            System.out.println(k);

        });*/


        Shape shape = SimpleFactroyApplicationUtils.getBeanInfo("circle");
        if(shape != null){
            shape.draw();
        }

    }

}
