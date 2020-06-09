package com.design.mode.factory.methon;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public class ConcreteFactoryB implements AbstractFactory {
    @Override
    public AbstractProduct build() {
        return new ConcreteProductB();
    }
}
