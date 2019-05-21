package com.gl.springbootdesignpatterns.StatusMode;

/**
 * @description: 状态的调用类
 * @author: TL
 * @create: 2019-05-21 09:18
 **/
public class StatusMain {

    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());

        c.request();
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
