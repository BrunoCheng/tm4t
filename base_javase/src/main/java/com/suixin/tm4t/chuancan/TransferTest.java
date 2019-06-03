package com.suixin.tm4t.chuancan;


/**
 * @Description:方法的传参
 * @data:2019/5/16
 * @Auther:acheng
 */
public class TransferTest {
    public static void main(String[] args) {
        TransferTest transferTest = new TransferTest();
        transferTest.first();
    }
    public void first(){
        int i = 5;
        Value value = new Value();
        value.i = 25;
        second(value,i);
        System.out.println(value.i);//20

    }
    public void second(Value value,int i){
        i = 0;
        value.i = 20;
        Value value1 = new Value();
        value = value1;
        System.out.println(value.i+" "+i);//15 , 0
    }
    class Value{
       int i = 15;
    }
}
