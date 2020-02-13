package com.design.mode.strategy;

/**
 * Created by zhangyuan on 2020/2/12 0012.
 */
public class Client {

    public static void main(String []args){
        Context context = new Context(new StrategyA());
        context.strategy();
    }
}
