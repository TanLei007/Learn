package com.gl.springbootdesignpatterns.StatusMode;

/**
 * @description: 维护一个具体状态的子类的实例
 * @author: TL
 * @create: 2019-05-21 09:05
 **/
public class Context {
    private State state;

    public Context(State state){
        this.state = state;
    }

    public State getReadWriteState() {
        return state;
    }

    public void setReadWriteState(State readWriteState) {
        System.out.println("当前状态" + state.getStateName());
        this.state = readWriteState;
    }

    public void request(){
        state.handle(this);
    }

}
