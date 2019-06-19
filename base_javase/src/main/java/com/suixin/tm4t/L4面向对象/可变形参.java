package com.suixin.tm4t.L4面向对象;

/**
 * @Description:可变形参
 * @data:2019/6/19
 * @Auther:acheng
 */
public class 可变形参 {
    //可变形参出现自1.5之后，替换之前使用的String[]的形式
    public static void main(String[] args) {
        test01(1,2,3,4);
    }
    public static void test01(int i,int ...i2){
        System.out.println(i2);//[I@330bedb4 ，输出的是数组，可见其底层还是数组
        System.out.println(i2[0]);//2
    }
}
