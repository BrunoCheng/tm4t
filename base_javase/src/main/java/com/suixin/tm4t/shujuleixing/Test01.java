package com.suixin.tm4t.shujuleixing;

import org.junit.Test;

/**
 * @Description:数据类型转换
 * @data:2019/5/13
 * @Auther:acheng
 */
public class Test01 {
    char aChar = 'a';
    int anInt = 10;
    String string = "hello";

    @Test
    public void add(){
        System.out.println(aChar+anInt+string);//107hello
        System.out.println(anInt+aChar+string);//107hello
        System.out.println(aChar+(anInt+string));//a10hello
        System.out.println(string+anInt+aChar);//hello10a
    }
    @Test
    public void add2(){
        short s = 150;
        //short = s+1;编译就不通过
        s +=1; //通过并且仍然为short类型
        short s2 = s++;

        int n =10;
        //n += n++ + ++n;//n=n+(n++) + (++n);
        n += ++n + n++;//还是32
        System.out.println(n);
    }

    @Test
    public void add3(){
       boolean x =true;
       boolean y =false;
       short z = 42;
       if ((z++==42)&&(y=true)){//z=43 y=true
           //注意y=true为赋值语句,
           System.out.println(z);
           System.out.println(y);
           z++;
       }
        if ((x = false)||(++z ==45)){
            z++;
        }
        System.out.println(z);//46
        //这个需要注意的有两点
        //1.y=true这类是包含了赋值操作,所有执行这句判断后属性会变
        //2.一个等于号也可以说在这里语句中直接代表了判断结果
    }
    @Test
    public void test01(){
        byte s = 1;
        s= (byte) (s+257);
        System.out.println(s);
    }
    //0~255整数转换为十六进制
    //方法一:
    public String test02(int i){
        return Integer.toHexString(i);
    }
    //手写代码
    public String test03(int i){
        //&运算,如果相对应位都是1，则结果为1，否则为0
        //十五为0000 1111,这样结果数可以获取到前四位的数字
        int i1 = i&15;
        String s1 = (i1>9)?(char)(i1-10+'A')+"":i1+"";
        int temp = i>>>4;
        i1 = temp & 15;
        String s2 = (i1>9)?(char)(i1-10+'A')+"":i1+"";
        return s2+""+s1;
    }
    @Test
    public void test02(){
        System.out.println(test02(60));
        System.out.println(test03(60));
    }
    //[30-55]之间的随机数
    //[0.0,1.0)  >> [0.0,26) >>[0.0+30,26+30) >> [30.0,56.0) >> [30,55]
    public int suiji(){
        return (int) (Math.random()*(55-30+1)+30);
    }
    //公式:int[a,b] = (int)(Math.random()*(b-a+1)+a)
}
