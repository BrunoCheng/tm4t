package com.suixin.tm4t.L1HelloJava.继承;

import com.suixin.tm4t.L1HelloJava.继承.Animal;
import com.suixin.tm4t.L1HelloJava.继承.Penguin;

/**
 * @Description:继承测试类
 * @data:2019/6/4
 * @Auther:acheng
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("小动物",001);
        animal.eat();//小动物正在吃
        Animal animal1 = new Penguin("小企鹅",002);
        animal1.eat();//小企鹅正在吃
    }
}
