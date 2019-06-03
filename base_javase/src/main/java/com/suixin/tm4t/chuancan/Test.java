package com.suixin.tm4t.chuancan;

/**
 * @Description:局部变量测试
 * @data:2019/5/26
 * @Auther:acheng
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.show("aaa");
        System.out.println(person.name);
    }
    static class Person{
        String name = "李四";
        int age;
        public void show(String name){
            name = "张三";
        }

    }
}

