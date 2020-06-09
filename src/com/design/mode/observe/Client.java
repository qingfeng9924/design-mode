package com.design.mode.observe;

/**
 * Created by zhangyuan on 2020/2/21 0021.
 */
public class Client {

    public static void main(String []args){
      ConcreteSubject concreteSubject = new ConcreteSubject();
      ConcreteObserver concreteObserver1 = new ConcreteObserver("状态1",concreteSubject);
      ConcreteObserver concreteObserver2 = new ConcreteObserver("状态3",concreteSubject);
      concreteSubject.addObserver(concreteObserver1);
      concreteSubject.addObserver(concreteObserver2);

      concreteSubject.setStatus("状态三");
      concreteSubject.update();

      System.out.println(concreteObserver1);
      System.out.println(concreteObserver2);
    }

}
