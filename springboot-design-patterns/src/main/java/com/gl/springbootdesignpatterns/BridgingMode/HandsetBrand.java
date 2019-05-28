package com.gl.springbootdesignpatterns.BridgingMode;

/**
 * @description: 手机品牌类
 * @author: TL
 * @create: 2019-05-28 19:44
 **/
public abstract class HandsetBrand {

    protected HandsetSoft soft;

    public void seHandsetSoft(HandsetSoft soft){
        this.soft = soft;
    }

    public abstract void run(String name);
}
