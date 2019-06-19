package com.suixin.tm4t.算法;

import java.util.Arrays;

/**
 * @Description:冒泡算法
 * @data:2016/6/4
 * @Auther:acheng
 */
public class 冒泡算法 {
    //在数组二分查找中要求时数组是有序的,所以对数组进行排序是很有必要的
    public static void main(String[] args) {
        int[] arr = new int[]{43, 99, 32, 76, -98, 0, 64, 33, -21, 32};
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(Arrays.toString(arr));
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
