package com.xhs.aop;

import com.xhs.inface.IAop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        IAop test = (IAop) context.getBean("aopTest");
//        AopTest test = (AopTest) context.getBean("aopTest");
        test.test();
    }
}
