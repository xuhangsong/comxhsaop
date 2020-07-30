package com.xhs.aop;

import com.xhs.inface.IAop;

/**
 * @author xuhan  build  2019/11/8
 */
public final class AopTest
        implements IAop
{

    @Override
    public void test(){
        System.out.println("aop 测试");
//        throw  new RuntimeException();
    }
}
