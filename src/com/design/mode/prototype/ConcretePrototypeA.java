package com.design.mode.prototype;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public class ConcretePrototypeA implements Prototype {


    @Override
    public <T extends Prototype> T cloneSelf() {
        T t = null;
        try {
            t = (T) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return t;
    }
}

