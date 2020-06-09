package come.design.mode.decorator;

/**
 * Created by zhangyuan on 2020/2/13 0013.
 */
public abstract class Decorator implements Component{

    private Component component;

    public void decorate(Component component){
        this.component = component;
    }

    @Override
    public void action() {
        this.component.action();
    }

}
