package com.suixin.tm4t.xunhuan;

/**
 * @Description:TODO
 * @data:2019/5/24
 * @Auther:acheng
 */

public class Test1 {
    public static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;// 1 2
            foo('D');
        }
    }
}


