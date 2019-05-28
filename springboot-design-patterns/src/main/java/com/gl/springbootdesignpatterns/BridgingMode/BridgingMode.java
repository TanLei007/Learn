package com.gl.springbootdesignpatterns.BridgingMode;

/**
 * @description: 桥接模式主调用
 * @author: TL
 * @create: 2019-05-28 19:48
 **/
public class BridgingMode {

    public static void main(String[] args) {
        HandsetBrand ab;

        ab = new HandsetBrandN();
        ab.seHandsetSoft(new HandsetGame());
        ab.run("N");
        ab.seHandsetSoft(new HandsetAddressList());
        ab.run("N");

        ab = new HandsetBrandM();
        ab.seHandsetSoft(new HandsetGame());
        ab.run("M");
        ab.seHandsetSoft(new HandsetAddressList());
        ab.run("M");
    }
}
