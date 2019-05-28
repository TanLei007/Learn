package com.gl.springbootdesignpatterns.BridgingMode;

/**
 * @description: 手机品牌N
 * @author: TL
 * @create: 2019-05-28 19:46
 **/
public class HandsetBrandN extends HandsetBrand{

    @Override
    public void run(String name) {
        soft.run(name);
    }
}
