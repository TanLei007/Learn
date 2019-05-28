package com.gl.springbootdesignpatterns.BridgingMode;

/**
 * @description: 手机游戏
 * @author: TL
 * @create: 2019-05-28 19:43
 **/
public class HandsetGame extends HandsetSoft{

    @Override
    public void run(String name) {
        System.out.println("运行手机游戏" + name);
    }
}
