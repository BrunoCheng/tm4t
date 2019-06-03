package com.suixin.tm4t.chongzai;

/**
 * @Description:自增变量
 * @data:2019/5/24
 * @Auther:acheng
 */
public class Test1 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        System.out.println(i);//0
        int j = i++;
        int k = i + ++i + i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
    }
}

