package com.suixin.tm4t.L3数组;

import java.util.ArrayList;

/**
 * @Description:类成员结构
 * @data:2019/5/22
 * @Auther:acheng
 */
public class Person {
    //属性,或者成员变量
    String name;
    //构造器
    public Person(){};
    public Person(String name){
        this.name = name;
    }
    //方法,或函数
    public void walk(){
        System.out.println("人走路..");
    }
    public String display(){
        return "名字是"+this.name;
    }
    //代码块
    {
        name = "张三";
        System.out.println("代码块");
    }
    //内部类
    class game{
       String name;
    }
    ArrayList<String> strings ;
}
