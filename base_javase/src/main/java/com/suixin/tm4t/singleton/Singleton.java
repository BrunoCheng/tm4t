package com.suixin.tm4t.singleton;

/**
 * @Description:静态内部类单例模式
 * @data:2019/6/3
 * @Auther:acheng
 */
public class Singleton {
    //私有化构造器
    private Singleton(){}

    private static class InnerClass{
        //类中的静态变量显示赋值代码块和静态代码块属于<clinit>方法,JVM确保只会加载一次
        //多线程情况下会保证线程安全
        private static final Singleton INSTANCE = new Singleton();
    }
    private static Singleton getInstance(){
        //返回静态内部类不是初始化
        return InnerClass.INSTANCE;
    }
}
