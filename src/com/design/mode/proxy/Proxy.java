package com.design.mode.proxy;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public class Proxy implements AbstractComponent {

    private ConcreteComponent concreteComponent;

    public Proxy(){
        this.concreteComponent = new ConcreteComponent();
    }

    @Override
    public void action() {
        this.concreteComponent.action();
    }
}
