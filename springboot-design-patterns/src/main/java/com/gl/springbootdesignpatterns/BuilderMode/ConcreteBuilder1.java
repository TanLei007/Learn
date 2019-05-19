package com.gl.springbootdesignpatterns.BuilderMode;

/**
 * @description: 具体建造者类
 * @author: TL
 * @create: 2019-05-19 15:52
 **/
public class ConcreteBuilder1 extends Builder{
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
