package com.suixin.tm4t.singleton;

/**
 * @Description:饿汉式,线程不安全情况
 * @data:2019/6/3
 * @Auther:acheng
 */
public class Singleton4 {
    private Singleton4(){}
    private static Singleton4 intacne = null;
    private static Singleton4 getInstance(){
        if (intacne == null){
            intacne = new Singleton4();
        }
        return intacne;
    }
}
