package com.design.mode.factory.methon;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public class ConcreteProductA implements AbstractProduct {
    @Override
    public void action() {
        System.out.print("I am product A ...");
    }
}
