package com.design.mode.simple.factory;

/**
 * Created by zhangyuan on 2020/2/10 0010.
 * 简单工厂模式
 */
public class Client {
    public static void main(String []args){
        AbstractOperation abstractOperation = OperationFactory.createOperation(OperationEnum.A);
        abstractOperation.operation();
    }
}
