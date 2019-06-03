package com.suixin.tm4t.abstracts;

/**
 * @Description:测试用抽象类01
 * @data:2019/5/12
 * @Auther:acheng
 */
public  abstract class TestAbstractDemo01 implements TestInterfaceDemo01,TestInterfaceDemo02{

    public void SayHi(){
        System.out.println("hi,abstract class!");
    }
    protected void SayHello(){
        System.out.println("hello,abstract class!");
    }
}
