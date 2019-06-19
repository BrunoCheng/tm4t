package com.suixin.tm4t.chongzai;

/**
 * @Description:子父类关系
 * @data:2019/6/19
 * @Auther:acheng
 */
class Fu {
    int num = 4;
    void show() {
        System.out.println("showFu");
    }
}
class Zi extends Fu {
    int num = 5;
    void show() {
        System.out.println("showZi");
    }
}
public class Test03 {
    public static void main(String[] args) {
        Fu f = new Zi();
        Zi z = new Zi();
        System.out.println(f.num);
        System.out.println(z.num);
        f.show();
        z.show();
    }
}
