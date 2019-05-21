package com.gl.springbootdesignpatterns.ObserverMode;

/**
 * @description: 具体观察者
 * @author: TL
 * @create: 2019-05-20 09:09
 **/
public class ConcreteObserver extends  Observer{

    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者的最新状态是" + name + "-" + observerState);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
