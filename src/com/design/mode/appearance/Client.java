package com.design.mode.appearance;

/**
 * Created by zhangyuan on 2020/2/20 0020.
 */
public class Client {
    public static void main(String []args){
        Facade facade = new Facade();
        facade.methodA();
    }
}
