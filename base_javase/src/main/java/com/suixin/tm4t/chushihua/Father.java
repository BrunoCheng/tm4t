package com.suixin.tm4t.chushihua;

/**
 * @Description:类初始化和实例话测试
 * @data:2019/5/27
 * @Auther:acheng
 */
public class Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.print("(1)");
    }

    Father() {
        System.out.print("(2)");
    }
    {
        System.out.print("(3)");
    }
    public int test(){
        System.out.print("(4)");
        return 1;
    }
    public static int method(){
        System.out.print("(5)");
        return 1;
    }
}
