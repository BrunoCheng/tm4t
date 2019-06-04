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
        //这里可以看出多态的优点
        //① 实现代码的通用性。
        //② Object类中定义的public boolean equals(Object obj){  }
        //  JDBC:使用java程序操作(获取数据库连接、CRUD)数据库(MySQL、Oracle、DB2、SQL Server)
        //③ 抽象类、接口的使用肯定体现了多态性。（抽象类、接口不能实例化）
    }

}
