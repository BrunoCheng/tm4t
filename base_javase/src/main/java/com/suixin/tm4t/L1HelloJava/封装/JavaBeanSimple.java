package com.suixin.tm4t.L1HelloJava.封装;

import java.util.Date;

/**
 * @Description:最常见的JavaBean
 * @data:2019/6/4
 * @Auther:acheng
 */
public class JavaBeanSimple {
    //这里实体类就封装了并私有了属性,对外只提供get和set方法.
    //这样保护了内部状态,并且提高了维护性和操作性.
    private int id;
    private String name;
    private Date createtime;
    private Date updatetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
    //提供有参构造器 ,默认无参构造器被替代,如果需要则自行创建
    public JavaBeanSimple(int id, String name, Date createtime, Date updatetime) {
        this.id = id;
        this.name = name;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }
    public JavaBeanSimple() {
    }
}
