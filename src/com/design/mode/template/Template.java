package com.design.mode.template;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public abstract class Template {
    public void templateMethod(){
        System.out.print("1+1=?");
        answerInfo();
    }
    abstract void answerInfo();
}
