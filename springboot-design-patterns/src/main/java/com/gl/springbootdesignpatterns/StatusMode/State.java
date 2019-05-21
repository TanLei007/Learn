package com.gl.springbootdesignpatterns.StatusMode;

import javax.naming.Context;

/**
 * @description: 抽象状态类
 * @author: TL
 * @create: 2019-05-21 09:02
 **/
public abstract class State {
    public abstract void handle(com.gl.springbootdesignpatterns.StatusMode.Context context);

    public abstract String getStateName();
}
