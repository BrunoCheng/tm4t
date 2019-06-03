package com.suixin.tm4t.shujuleixing;

import org.junit.Test;

/**
 * @Description:枚举
 * @data:2019/5/14
 * @Auther:acheng
 */
public class Test02 {
    @Test
    public void test01() {
        int year = 2019;
        int month = 9;
        int day = 15;
        int sumDay = 0;
        switch (month) {
            case 12:
                sumDay += 30;
            case 11:
                sumDay += 31;
            case 10:
                sumDay += 30;
            case 9:
                sumDay += 31;
            case 8:
                sumDay += 31;
            case 7:
                sumDay += 30;
            case 6:
                sumDay += 31;
            case 5:
                sumDay += 30;
            case 4:
                sumDay += 31;
            case 3:
                if ((year %4 ==0 && year %100 ==0)||(year%400 ==0)){
                    sumDay += 29;
                }else {
                    sumDay += 28;
                }
            case 2:
                sumDay += 31;
            default:
                sumDay += day;
        }
        System.out.println(sumDay);
    }
}
