package com.suixin.tm4t.L1HelloJava.封装;

/**
 * @Description:丈夫封装实例
 * @data:2019/6/4
 * @Auther:acheng
 */
public class Husband {

    /*
     * 对属性的封装
     * 一个人的姓名、性别、年龄、妻子都是这个人的私有属性
     */
    private String name ;
    private String sex ;
    private int age ;    /* 改成 String类型的*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 120){
            System.out.println("ERROR：error age input....");    //对属性进行限制,提示錯誤信息
        }else{
            this.age = age;
        }
    }
    public String getSexName(String sex) {
        String sexName;
        if("0".equals(sex)){
            sex = "女";
        }
        else if("1".equals(sex)){
            sex = "男";
        }
        else{
            sex = "人妖???";
        }
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = getSexName(sex);
    }
}
