package com.suixin.tm4t.singleton;

/**
 * @Description:懒汉式单例模式,线程安全,空间换时间
 * @data:2019/6/3
 * @Auther:acheng
 */
public class Singleton2 {
    private Singleton2(){}
    public static final Singleton2 INSTANCE = new Singleton2();
}

