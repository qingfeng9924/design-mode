package com.design.mode.builder;

/**
 * Created by zhangyuan on 2020/2/20 0020.
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("构造A部分...");
    }

    @Override
    public void buildPartB() {
        product.setPartB("构造B部分...");
    }

}
