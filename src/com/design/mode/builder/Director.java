package com.design.mode.builder;

/**
 * Created by zhangyuan on 2020/2/20 0020.
 */
public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
