package com.suixin.tm4t.L1HelloJava.多态;

import com.suixin.tm4t.L1HelloJava.继承.Animal;

/**
 * @Description:多态测试类
 * @data:2019/6/4
 * @Auther:acheng
 */
public class Test {
    public static void main(String[] args) {
        /**

         */
        Animal animal = new Animal("动物",0);
        animal.eat();//动物正在吃
        Animal dog = new Dog("狗",1);
        dog.eat();//狗狗吃肉
        Animal cat = new Cat("猫",1);
        cat.eat();//猫猫吃鱼

        //由上面可以理解一句话:父类引用指向子类对象
    }

}
