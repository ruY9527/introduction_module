package com.iyang.aop.config;

import com.iyang.aop.service.Calculate;
import com.iyang.aop.service.impl.CalculateImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Yang
 * @date 2020/8/12 / 15:18
 */

@Configuration
@EnableAspectJAutoProxy
public class AopStartConfig {

    @Bean
    public Calculate calculate(){
        return new CalculateImpl();
    }

    @Bean
    public YangLearnAspect yangLearnAspect(){
        return new YangLearnAspect();
    }

}
