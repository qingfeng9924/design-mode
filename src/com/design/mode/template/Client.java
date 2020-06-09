package com.design.mode.template;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public class Client {

    public static void main(String []args){
        Template templateA = new ConcreteTemplateA();
        templateA.templateMethod();
    }

}
