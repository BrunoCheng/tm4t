package com.suixin.tm4t.singleton;

/**
 * @Description:饿汉式,线程安全情况下
 * @data:2019/6/3
 * @Auther:acheng
 */
public class Singleton5 {
    private Singleton5(){}
    //添加volitile是为防止DCl失效得问题
    //即JVM存在乱序执行过程
    //intacne = new Singleton5();这个分为三给步骤
    //1,在堆内存开辟空间
    //2.在堆内存中实例化singleton5里面的各个参数
    //3,把对象instance指向堆内存空间
    //这三步JVM是乱序执行的,可能存在先执行3然后被切换到别的线程,此时显示为null,就会返回null的intance
    private volatile static Singleton5 intacne = null;
    private static Singleton5 getInstance(){
        //优化
        if (intacne == null){
            //解决安全问题
            synchronized (Singleton5.class){
                if (intacne == null){
                    intacne = new Singleton5();
                }
            }
        }
        return intacne;
    }
}