package com.design.mode.observe;

/**
 * Created by zhangyuan on 2020/2/21 0021.
 */
public class ConcreteObserver implements AbstractObserver {

    private String status;

    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String status,ConcreteSubject subject) {
        this.status = status;
        this.concreteSubject = subject;
    }

    @Override
    public void update() {
        this.setStatus(this.concreteSubject.getStatus());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ConcreteObserver{" +
                "status='" + status + '\'' +
                ", concreteSubject=" + concreteSubject +
                '}';
    }
}
