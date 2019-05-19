package com.gl.springbootdesignpatterns.BuilderMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 产品类，有多个部件组成
 * @author: TL
 * @create: 2019-05-19 15:47
 **/
public class Product {
    List<String> list = new ArrayList<>();

    public void add(String part){
        list.add(part);
    }

    public void show(){
        System.out.println("创建产品");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
