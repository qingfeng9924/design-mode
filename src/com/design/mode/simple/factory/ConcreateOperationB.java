package com.design.mode.simple.factory;

/**
 * Created by zhangyuan on 2020/2/10 0010.
 */
public class ConcreateOperationB implements AbstractOperation {

    @Override
    public void operation() {
        System.out.print("operation : B");
    }
}
