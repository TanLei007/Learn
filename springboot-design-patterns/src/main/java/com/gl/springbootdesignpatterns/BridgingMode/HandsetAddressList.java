package com.gl.springbootdesignpatterns.BridgingMode;

/**
 * @description: 手机号通讯录
 * @author: TL
 * @create: 2019-05-28 19:43
 **/
public class HandsetAddressList extends HandsetSoft{

    @Override
    public void run(String name) {
        System.out.println("运行手机通讯录" + name);
    }
}
