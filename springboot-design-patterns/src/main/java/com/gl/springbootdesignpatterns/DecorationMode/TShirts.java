package com.gl.springbootdesignpatterns.DecorationMode;

/**
 * @description: 服装-大体恤
 * @author: TL
 * @create: 2019-05-18 16:49
 **/
public class TShirts extends Finery{
    @Override
    public void show(){
        System.out.println("大体恤");
        super.show();
    }
}
