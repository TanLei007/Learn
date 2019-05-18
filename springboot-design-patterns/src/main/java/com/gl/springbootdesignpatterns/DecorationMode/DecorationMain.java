package com.gl.springbootdesignpatterns.DecorationMode;

import sun.applet.Main;

/**
 * @description: 装饰模式调用
 * @author: TL
 * @create: 2019-05-18 17:03
 **/
public class DecorationMain {

    public static void main(String[] args) {
        Person person = new Person("小菜欧巴");

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        Sneakers sneakers = new Sneakers();

        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        sneakers.decorate(bigTrouser);
        sneakers.show();
    }
}
