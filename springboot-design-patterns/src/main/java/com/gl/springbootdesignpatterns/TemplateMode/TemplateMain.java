package com.gl.springbootdesignpatterns.TemplateMode;

/**
 * @description: 模板方法模式调用
 * @author: TL
 * @create: 2019-05-19 11:47
 **/
public class TemplateMain {

    public static void main(String[] args) {
        AbstractClass a = new ConcreteClassA();
        a.templateMethod();

        a = new ConcreteClassB();
        a.templateMethod();
    }
}
