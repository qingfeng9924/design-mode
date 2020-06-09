package com.design.mode.builder;

/**
 * Created by zhangyuan on 2020/2/20 0020.
 */
public abstract class Builder {

    Product product = new Product();

    public Product getProduct() {
        return product;
    }

    abstract void buildPartA();

    abstract void buildPartB();
}