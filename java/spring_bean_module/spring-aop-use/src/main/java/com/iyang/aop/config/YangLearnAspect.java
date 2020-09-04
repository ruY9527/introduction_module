package com.iyang.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author Yang
 * @date 2020/8/12 / 15:11
 */

@Aspect
public class YangLearnAspect {

    @Pointcut("execution(* com.iyang.aop.service.Calculate.*(..))")
    public void pointCut(){};


    @Before(value = "pointCut()")
    public void methodBefore(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法 [" + methodName + " ] 之前执行<前置通知>,入参" + Arrays.asList(joinPoint.getArgs()));
    }

    @After(value = "pointCut()")
    public void methodAfter(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法【"+methodName+"】之前执行<后置通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

    @AfterReturning(value = "pointCut()")
    public void methodReturning(JoinPoint joinPoint ) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法【"+methodName+"】之前执行<返回通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

    @AfterThrowing(value = "pointCut()")
    public void methodAfterThrowing(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法【"+methodName+"】之前执行<异常通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

}



