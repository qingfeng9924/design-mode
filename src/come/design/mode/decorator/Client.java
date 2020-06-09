package come.design.mode.decorator;

import com.design.mode.simple.factory.ConcreateOperationB;

/**
 * Created by zhangyuan on 2020/2/13 0013.
 */
public class Client {

    public static void main(String []args){
        //被装饰者
        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        concreteDecoratorA.decorate(concreteComponent);
        ConcreteDecoratorB concreateOperationB = new ConcreteDecoratorB();
        concreateOperationB.decorate(concreteDecoratorA);
        concreateOperationB.action();
    }
}
