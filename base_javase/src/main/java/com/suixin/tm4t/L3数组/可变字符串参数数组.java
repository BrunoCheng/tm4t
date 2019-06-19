package com.suixin.tm4t.L3数组;

import org.junit.Test;

/**
 * @Description:Arrays工具类
 * @data:2019/5/14
 * @Auther:acheng
 */
public class 可变字符串参数数组 {
    /**
     * 数组的特点:
     * 1)数组是有序排列的
     * 2)数组属于引用数据类型的变量。数组的元素,既可以是基本数据类型,也可以是引用数据类型
     * 3)创建数组对象会在内存中开辟一整块连续的空间
     * 4)数组的长度一旦确定,就不能修改。所以初始化时必须指定长度:静态直接添加参数,动态指定长度
     */

    //创建一个长度为6的int型数组,要求数组元素的值都在1-30之间,且是随机赋值。同时,要求元素的值各不相同。
    @Test
    public void test01(){
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            //获取[1,30]
            arr[i] = (int) ((Math.random() * 30) + 1);
            //遍历当前数组,如果有这个数,重新执行该次循环
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;//点睛之笔
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    static class Person {
        String name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person = null;
       可变字符串参数数组 arrayTest = new 可变字符串参数数组();
       arrayTest.show(new String[]{"aa","bb","cc"});//原先的方式,可变和数组都可以这样使用
       arrayTest.show("aa","bb","cc");//可变个数形参样式,不用new了




    }


/*    public void show(String[] strs){
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }*/
    public void show(String ... strs){
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }


}
