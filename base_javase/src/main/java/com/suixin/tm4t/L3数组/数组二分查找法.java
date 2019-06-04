package com.suixin.tm4t.L3数组;

/**
 * @Description:二分法查找
 * @data:2019/5/22
 * @Auther:acheng
 */
public class 数组二分查找法 {
    public static void main(String[] args) {
        //二分法查找：要求此数组必须是有序的。
        int[] arr3 = new int[]{-99, -54, -2, 0, 2, 33, 43, 256, 999};
        boolean isFlag = true;
        int number = 256;
        int head = 0;//首索引位置
        int end = arr3.length - 1;//尾索引位置
        while (head <= end) {
            int middle = (head + end) / 2;
            if (arr3[middle] == number) {
                System.out.println("找到指定的元素，索引为：" + middle);
                isFlag = false;
                break;
            } else if (arr3[middle] > number) {
                end = middle - 1;
            } else {//arr3[middle] < number head = middle + 1; } }
                if (isFlag) {
                    System.out.println("未找打指定的元素");
                }
            }
        }
    }
}