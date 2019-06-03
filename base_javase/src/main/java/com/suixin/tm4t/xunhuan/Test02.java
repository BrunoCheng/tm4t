package com.suixin.tm4t.xunhuan;

/**
 * @Description:九九乘法表
 * @data:2019/5/22
 * @Auther:acheng
 */
public class Test02 {
    public static void main(String[] args) {
        for(int i =1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j) + "\t");
            }
            System.out.println();
        }
    }
}
