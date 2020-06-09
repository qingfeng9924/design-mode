package com.design.mode.prototype;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public class Client {
    public static void main(String []args){
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        ConcretePrototypeA concretePrototypeAClone = concretePrototypeA.cloneSelf();
    }
}
