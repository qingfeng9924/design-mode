package com.design.mode.factory.methon;

import com.design.mode.proxy.AbstractComponent;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public class ConcreteFactoryA implements AbstractFactory {

    @Override
    public AbstractProduct build() {
        return new ConcreteProductA();
    }

}
