package com.gl.springbootdesignpatterns.DecorationMode;

/**
 * @description: 服装-球鞋
 * @author: TL
 * @create: 2019-05-18 16:49
 **/
public class Sneakers extends Finery{
    @Override
    public void show(){
        System.out.println("球鞋");
        super.show();
    }
}
