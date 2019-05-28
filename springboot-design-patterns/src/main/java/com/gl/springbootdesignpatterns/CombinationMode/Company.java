package com.gl.springbootdesignpatterns.CombinationMode;

/**
 * @description: 公司类 抽象类或接口
 * @author: TL
 * @create: 2019-05-24 09:17
 **/
public abstract class Company {

    protected String name;

    public Company(String name){
        this.name = name;
    }

    /**
     * 添加
     * @param c
     */
    public abstract void add(Company c);

    /** 移除
     * @param c
     */
    public abstract void remove(Company c);

    /**
     * 显示
     * @param depth
     */
    public abstract void display(int depth);

    /**
     * 履行职责
     */
    public abstract void lineOfDuty();
}
