package com.gl.springbootdesignpatterns.TemplateMode;

/**
 * @description: 子类实现
 * @author: TL
 * @create: 2019-05-19 11:45
 **/
public class ConcreteClassA extends AbstractClass {

    @Override
    public void primitiveOperation1() {
        System.out.println("我是具体实现类A的方法A");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("我是具体实现类A的方法B");
    }
}
