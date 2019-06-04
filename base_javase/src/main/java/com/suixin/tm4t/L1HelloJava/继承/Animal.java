package com.suixin.tm4t.L1HelloJava.继承;

/**
 * @Description:动物父类
 * @data:2019/6/4
 * @Auther:acheng
 */
public class Animal {
    private String name;
    private int id;


    //子类中所有的构造函数都会默认访问父类中的空参数的构造函数，因为每一个子类构造内第一行都有默认的语句super();
    //
    //如果父类中没有空参数的构造函数，那么子类的构造函数内，必须通过super语句指定要访问的父类中的构造函数。
        //如本例继承了Animal类的子类构造器必须super(myName, myid);
    //
    //如果子类构造函数中用this来指定调用子类自己的构造函数，那么被调用的构造函数也一样会访问父类中的构造函数。
    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}
