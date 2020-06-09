package come.design.mode.decorator;

/**
 * Created by zhangyuan on 2020/2/13 0013.
 */
public class ConcreteDecoratorA extends Decorator{

    @Override
    public void action() {
        System.out.print("加了点糖");
        super.action();
    }
}
