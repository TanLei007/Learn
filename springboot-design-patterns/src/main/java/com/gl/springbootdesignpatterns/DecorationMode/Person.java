package com.gl.springbootdesignpatterns.DecorationMode;

import lombok.Data;

/**
 * @description: 人
 * @author: TL
 * @create: 2019-05-18 16:40
 **/
@Data
public class Person {

    private String name;

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的" + name);
    }
}
