package com.gl.springbootdesignpatterns.ObserverMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 抽象统治者
 * @author: TL
 * @create: 2019-05-20 09:01
 **/
public class Subject {
    private List<Observer> observersList = new ArrayList<>();

    /**
     * 添加观察者
     * @param observer
     */
    public void attach(Observer observer){
        observersList.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void detach(Observer observer){
        observersList.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObserver(){
        for (Observer observer : observersList) {
            observer.update();
        }
    }
}
