package come.design.mode.decorator;

/**
 * Created by zhangyuan on 2020/2/13 0013.
 */
public class ConcreteComponent implements Component {

    @Override
    public void action() {
        System.out.print("一杯咖啡");
    }
}
