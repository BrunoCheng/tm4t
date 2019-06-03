package com.suixin.tm4t;

/**
 * @Description:TODO
 * @data:2019/5/26
 * @Auther:acheng
 */
public class Test {
    public static void main(String[] args) {

        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        //Interger中有缓存存在为-128-127数组,超过了才会new
        //主页主要是为了提高性能
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false

        //其他数据类型没有
        Float f1 = 1.0f;
        Float f2 = 1.0f;
        System.out.println(f1 ==f2);//false
    }
}
