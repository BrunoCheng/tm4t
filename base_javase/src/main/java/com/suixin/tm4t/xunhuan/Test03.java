package com.suixin.tm4t.xunhuan;

import org.junit.Test;

/**
 * @Description:百度一道递归面试题
 * @data:2019/5/22
 * @Auther:acheng
 */
public class Test03 {
    @Test
    public void binomial(){
        recursion(10);
        System.out.println(cont);
    }
    private static int cont = 0;
    public static int recursion(int k){
        cont ++;
        System.out.println("cout1:"+cont+",k="+k);
        if (k<=0){
            return 0;
        }
        return recursion(k-1)+recursion(k-2);
    }
}
