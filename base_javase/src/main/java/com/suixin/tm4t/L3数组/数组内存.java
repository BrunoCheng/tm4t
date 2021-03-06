package com.suixin.tm4t.L3数组;

/**
 * @Description:数组内存测试
 * @data:2019/5/22
 * @Auther:acheng
 */
public class 数组内存 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        //new int[]{};1.在内存堆中new开辟一块空间,并初始化值为0,0,0;
        System.out.println(arr);// 2.此时会有一个地址值:[I@330bedb4 [代表数组 I代表整数 @分隔符 后边内存地址十六进制
        //3.{1,2,3},将出初始化值替换为1,2,3;
        //在栈中压入变量名arr 并引用地址值[I@330bedb4

        int[] arr2 ={1,2,3};
        System.out.println(arr2);//内存中又开了新的地址值
        String[] strArr = new String[4];//同理, new String[4]{};1.在内存堆中new开辟一块空间,并初始化值为null,null,null.null
        System.out.println(strArr);//地址值为;[Ljava.lang.String;@330bedb4
        strArr[1]="张三";//将第二个字符串改为张三
        strArr[2]="李四";//将第三个字符串改为李四

        strArr = new String[3];//右边还是新建数组,并初始化值null,null,null,并将新数组的地址值覆盖掉strArr之前的[Ljava.lang.String;@330bedb4
        System.out.println(strArr);//地址值为:[Ljava.lang.String;@2503dbd3
        System.out.println(strArr[1]);//null 此时再调用就是使用新的地址值去内存查找
    }
}
