package com.suixin.tm4t.L2基本语法.L2_3流程控制.switch_case;

import org.junit.Test;

/**
 * @Description:switch_case测试类
 *  1.switch(表达式)中表达式的值必须是下述几种类型之一：byte，short， char，int，枚举 (jdk 5.0)，String (jdk 7.0)；
 *  2.case子句中的值必须是常量，不能是变量名或不确定的表达式值
 *  3.同一个switch语句，所有case子句中的常量值互不相同；
 *  4.break语句用来在执行完一个case分支后使程序跳出switch语句块；如 果没有break，程序会顺序执行到switch结尾
 *  5.default子句是可任选的。同时，位置也是灵活的。当没有匹配的case时， 执行default
 * @data:2016/6/3
 * @Auther:acheng
 */
public class SwitchCaseTest {
    //单元测试方法没有形参
    @Test
    public void testNoBreak(){
        switch (7) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
            case 7:
                System.out.println(7);
            case 8:
                System.out.println(8);
            default:
                System.out.println("end");
        }//7 8 end
        //说明没有break不会停下来
    }

    @Test
    public void testNoBreak2(){
        switch (7) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            default:
                System.out.println("end");
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
            case 7:
                System.out.println(7);
            case 8:
                System.out.println(8);

        }//7 8
        //说明没有break不会停下来,并不是说所有比匹配就去default
    }
    @Test
    public void testNoBreak3(){
        switch (9) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            default:
                System.out.println("end");
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
            case 7:
                System.out.println(7);
            case 8:
                System.out.println(8);

        }//end 4 5 6 7 8
        //说明没有break不会停下来,并不是说所有比匹配就去default
        //default很多时候也和case类似,只是对应都匹配的情况,并不是执行default就结束
    }
    @Test
    public void testNoBreak4() {
        switch (9) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            default:
                System.out.println("end");
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
            case 7:
                System.out.println(7);
            case 8:
                System.out.println(8);
        }//end 4 到break停止
    }
}
