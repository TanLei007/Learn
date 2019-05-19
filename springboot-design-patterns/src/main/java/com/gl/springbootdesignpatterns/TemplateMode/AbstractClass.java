package com.gl.springbootdesignpatterns.TemplateMode;

/**
 * @description: 抽象类
 * @author: TL
 * @create: 2019-05-19 11:40
 **/
public abstract class AbstractClass {

    /**
     * 抽象方法放到子类中去实现
     */
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    /**
     * 模板方法，给出罗辑的骨架，而罗辑的组成是一些相应的抽象操作，
     * 他们都推迟到子类实现
     */
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();

        System.out.println("我要做一些公共的工作");
    }
}
