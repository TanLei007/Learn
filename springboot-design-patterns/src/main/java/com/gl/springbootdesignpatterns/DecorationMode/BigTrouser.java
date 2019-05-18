package com.gl.springbootdesignpatterns.DecorationMode;

/**
 * @description: 服装-垮裤
 * @author: TL
 * @create: 2019-05-18 16:49
 **/
public class BigTrouser extends Finery{
    @Override
    public void show(){
        System.out.println("垮裤");
        super.show();
    }
}
