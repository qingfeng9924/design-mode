package come.design.mode.decorator;

/**
 * Created by zhangyuan on 2020/2/13 0013.
 */
public class ConcreteDecoratorB extends Decorator{

    @Override
    public void action() {
        System.out.print("加了点盐");
        super.action();
    }
}
