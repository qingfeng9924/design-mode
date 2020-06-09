package com.design.mode.observe;

/**
 * Created by zhangyuan on 2020/2/21 0021.
 */
public class ConcreteSubject extends AbstractSubject {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
