package com.gl.springbootdesignpatterns.BuilderMode;

/**
 * 建造者模式是在当创建复杂对象的算法应该独立于该对象的组成部分
 * 以及他们的装配方式时使用的模式
 **/
public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
