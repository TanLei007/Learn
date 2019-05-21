package com.gl.springbootdesignpatterns.ObserverMode;

/**
 * @description: 具体主题或具体通知者
 * @author: TL
 * @create: 2019-05-20 09:07
 **/
public class ConcreteSubject extends Subject {
    /**
     * 观察者的状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
