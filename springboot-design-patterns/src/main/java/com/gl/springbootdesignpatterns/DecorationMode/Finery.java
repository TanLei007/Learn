package com.gl.springbootdesignpatterns.DecorationMode;

import lombok.Data;

/**
 * @description: 服饰类
 * @author: TL
 * @create: 2019-05-18 16:42
 **/
@Data
public class Finery extends Person {

    protected Person component;

    /**
     * 打扮
     * @param component
     */
    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show(){
        if(component != null){
            component.show();
        }
    }
}
