package com.suixin.tm4t.chongzai;

/**
 * @Description:子父类多态性
 * @data:2019/6/19
 * @Auther:acheng
 */

class Fu1 {

    int num = 5;

    static void method4() {

        System.out.println("fu static  method_4");

    }

    void method3() {

        System.out.println("fu  method_3");
    }
}

class Zi1 extends Fu1 {

    int num = 8;

    static void method4() {

        System.out.println("zi static method_4");

    }

    void method3() {
        System.out.println("zi method_3");
    }
}

public class ChongZaiDemo04 {
    public static void main(String[] args) {
        Fu1 f = new Zi1();

        System.out.println(f.num);// 5 与父类一致

        f.method4();//fu static method_4 与父类一致

        f.method3();//zi method_3 编译时与父类一致，运行时与子类一致

        Zi1 z = new Zi1();

        System.out.println(z.num);//8

        z.method4();//zi static method_4

        z.method3();//zi method_3
    }
}
