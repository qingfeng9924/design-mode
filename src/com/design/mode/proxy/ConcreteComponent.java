package com.design.mode.proxy;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public class ConcreteComponent implements AbstractComponent {

    @Override
    public void action() {
        System.out.print("我是被代理者...");

    }
}
