package com.design.mode.strategy;

/**
 * Created by zhangyuan on 2020/2/12 0012.
 */
public class Context {

    private AbstractStrategy strategy;

    public Context(AbstractStrategy strategy){
        this.strategy = strategy;
    }

    public void strategy(){
        this.strategy.strategy();
    }

}
