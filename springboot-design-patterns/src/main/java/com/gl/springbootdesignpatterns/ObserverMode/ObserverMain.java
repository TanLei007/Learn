package com.gl.springbootdesignpatterns.ObserverMode;

/**
 * @description: 观察者调用类
 * @author: TL
 * @create: 2019-05-20 09:14
 **/
public class ObserverMain {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver(subject, "X"));
        subject.attach(new ConcreteObserver(subject, "Y"));
        subject.attach(new ConcreteObserver(subject, "Z"));

        subject.setSubjectState("ABC");
        subject.notifyObserver();
    }
}
