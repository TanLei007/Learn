package com.gl.springbootdesignpatterns.BuilderMode;

/**
 * @description: 抽象建造者类，
 * @author: TL
 * @create: 2019-05-19 15:50
 **/
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
