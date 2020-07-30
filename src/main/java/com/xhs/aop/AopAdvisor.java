package com.xhs.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author xuhan  build  2019/11/8
 */
@Aspect
public class AopAdvisor {


    @Pointcut("execution(* com.xhs.inface.IAop.*(..))")
//    @Pointcut("execution(* com.xhs.aop.AopTest.*(..))")
    public void test(){}

    @Before("test()")
    public void before(){
        System.out.println("before");
    }
    @After("test()")
    public void after(){
        System.out.println("after");
    }
    @Around("test()")
    public void around(ProceedingJoinPoint p) throws Throwable {
        System.out.println("around before");
        p.proceed();
        System.out.println("around after");
    }
    @AfterThrowing("test()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    @AfterReturning("test()")
    public void afterReturn(){
        System.out.println("afterReturn");
    }
}
