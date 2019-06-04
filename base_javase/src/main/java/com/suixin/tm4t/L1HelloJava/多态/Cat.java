package com.suixin.tm4t.L1HelloJava.多态;

import com.suixin.tm4t.L1HelloJava.继承.Animal;

/**
 * @Description:猫猫多态类
 * @data:2019/6/4
 * @Auther:acheng
 */
public class Cat extends Animal {
    public Cat(String myName, int myid) {
        super(myName, myid);
    }

    @Override
    public void eat() {
        System.out.println("猫猫吃鱼");
    }
}
