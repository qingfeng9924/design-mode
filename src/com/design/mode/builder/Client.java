package com.design.mode.builder;

/**
 * Created by zhangyuan on 2020/2/20 0020.
 */
public class Client {

    public static void main(String []args){
        Builder concreteBuilder = new ConcreteBuilder();
        Director director = new Director();
        director.construct(concreteBuilder);
        Product product = concreteBuilder.getProduct();
        System.out.print(product);
    }

}
