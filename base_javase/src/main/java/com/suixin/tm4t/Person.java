package com.suixin.tm4t;

/**
 * @Description:person类
 * @data:2019/5/26
 * @Auther:acheng
 */
public class Person {
    private int age;
    private String name;
    Person(){
    }
    Person(int age){
        this.age =age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
