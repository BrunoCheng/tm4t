package com.suixin.tm4t.chushihua;

/**
 * @Description:类初始化和实例化
 * @data:2019/5/27
 * @Auther:acheng
 */
public class Son extends Father{
    private int i = test();
    private static int j = method();

    static {
        System.out.print("(6)");
    }

    Son() {
        System.out.print("(7)");
    }

    {
        System.out.print("(8)");
    }

    public int test() {
        System.out.print("(9)");
        return 1;
    }

    public static int method() {
        System.out.print("(10)");
        return 1;
    }
}

