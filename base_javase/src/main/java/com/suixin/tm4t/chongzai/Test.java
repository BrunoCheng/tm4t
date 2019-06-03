package com.suixin.tm4t.chongzai;

import java.io.PrintStream;

/**
 * @Description:一道看似传参的面试题
 * @data:2019/5/16
 * @Auther:acheng
 */
public class Test {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        method(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    //方法一:这种有点偷鸡的感觉,效果是有的,但是程序直接停了不太好
/*    public static void method(int a,int b){
        System.out.println("a="+a*a);
        System.out.println("b="+a*b);
        System.exit(0);
    }*/
    public static void method(int a,int b){
        PrintStream ps = new PrintStream(System.out){
            @Override
            public void println(String s) {
                if ("a=10".equals(s)){
                    s = "a=100";
                }else if ("b=20".equals(s)){
                    s ="b=200";
                }
                super.println(s);
            }
        };
        System.setOut(ps);
    }
}
