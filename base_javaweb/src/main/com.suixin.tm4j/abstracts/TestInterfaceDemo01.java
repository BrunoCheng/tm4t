package com.suixin.tm4t.abstracts;

/**
 * @Description: 测试接口01
 * @Date:2019/5/12 14:44
 * @Auther:acheng
 **/
public interface TestInterfaceDemo01 {

    //变量会被隐式地指定为public static final变量（并且只能是public static final变量，用private修饰会报编译错误）
    public static final String test01 = null;
    String test02 = null;

    //方法会被隐式地指定为public abstract方法且只能是public abstract方法
    // 这也就是为什么interface接口方法和变量可以不用写权限
    //void sayHi(){}方法不能有实现
    void interfaceMethod01();
}
