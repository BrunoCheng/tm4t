package com.suixin.tm4t.xunhuan;

/**
 * @Description:循环测试
 * @data:2019/5/22
 * @Auther:acheng
 */
public class Test01 {
    public static void main(String[] args) {
        int i=10;
        while(i>0){
            i = i +1;
            if(i==10){
                break;
            }
        }
        System.out.println("i=" + i);
    }
}
