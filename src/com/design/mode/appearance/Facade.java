package com.design.mode.appearance;

/**
 * Created by zhangyuan on 2020/2/20 0020.
 */
public class Facade {

    private SubSystemA subSystemA;

    private SubSystemB subSystemB;

    public Facade(){
        this.subSystemA = new SubSystemA();
        this.subSystemB = new SubSystemB();
    }

    public void methodA(){
        this.subSystemA.methodOne();
        this.subSystemB.methodB();
    }
}
