package com.gl.springbootdesignpatterns.BuilderMode;

/**
 * @description: 指挥者类
 * @author: TL
 * @create: 2019-05-19 15:55
 **/
public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
