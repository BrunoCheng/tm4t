package com.suixin.tm4t.chushihua;

import org.junit.Test;

/**
 * @Description:类初始化和实例化测试类
 * @data:2019/5/27
 * @Auther:acheng
 */
public class TestInit {
    //注意如果类名字为Test,那么注解为@org.junit.Test
    @Test
    public void testInit() {
        Father f1 = new Father();//(5)(1)(4)(3)(2)
        System.out.println();
        Father f2 = new Father();//(4)(3)(2)
    }

    @Test
    public void testInit2() {
        Son s1 = new Son();//(5)(1)(10)(6)  (9)(3)(2)(9)(8)(7)
        System.out.println();
        Son s2 = new Son();//(9)(3)(2)(9)(8)(7)
    }
    @Test
    public void test3(){
        Father p = new Son();//(5)(1)(10)(6)  (9)(3)(2)(9)(8)(7)
    }
}
