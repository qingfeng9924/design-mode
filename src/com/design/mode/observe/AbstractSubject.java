package com.design.mode.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyuan on 2020/2/21 0021.
 */
public abstract class AbstractSubject {



    private List<AbstractObserver> observerList = new ArrayList<>();

    public void addObserver(AbstractObserver observer){
        this.observerList.add(observer);
    }

    public void remove(AbstractObserver observer){
        this.observerList.remove(observer);
    }

    public void update(){
        observerList.forEach(observer -> {
            observer.update();
        });
    }
}
