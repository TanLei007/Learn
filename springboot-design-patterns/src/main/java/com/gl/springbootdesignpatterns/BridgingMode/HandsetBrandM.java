package com.gl.springbootdesignpatterns.BridgingMode;

/**
 * @description: 手机品牌M
 * @author: TL
 * @create: 2019-05-28 19:46
 **/
public class HandsetBrandM extends HandsetBrand{

    @Override
    public void run(String name) {
        soft.run(name);
    }
}
