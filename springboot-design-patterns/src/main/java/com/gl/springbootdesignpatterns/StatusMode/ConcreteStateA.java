package com.gl.springbootdesignpatterns.StatusMode;


import javax.naming.Context;

/**
 * 当一个对象的行为取决于它的状态，并且他必须在运行时刻根据状态改变它的行为时
 * 就可以考虑使用状态模式了
 **/
public class ConcreteStateA extends State{

    @Override
    public String getStateName() {
        return "我是状态A";
    }

    @Override
    public void handle(com.gl.springbootdesignpatterns.StatusMode.Context context) {
        context.setReadWriteState(new ConcreteStateB());
    }
}
