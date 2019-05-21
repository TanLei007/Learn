package com.gl.springbootdesignpatterns.StatusMode;


/**
 * @description: 具体状态
 * @author: TL
 * @create: 2019-05-21 09:03
 **/
public class ConcreteStateB extends State{

    @Override
    public String getStateName() {
        return "我是状态B";
    }

    @Override
    public void handle(com.gl.springbootdesignpatterns.StatusMode.Context context) {
        context.setReadWriteState(new ConcreteStateA());
    }
}
