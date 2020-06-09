package com.design.mode.factory.methon;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public class Client {
    public static void main(String []args){
        AbstractFactory factoryA = new ConcreteFactoryA();
        factoryA.build().action();

    }
}
