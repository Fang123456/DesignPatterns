package adapter.duck;

/**
 * Created by Administrator on 2016/8/4 0004.
 */
public class DuckOne implements Duck {
    @Override
    public void quack() {
        System.out.println("鸭子第一种叫声模式：嘎嘎");
    }

    @Override
    public void fly() {
        System.out.println("鸭子第一种飞行模式：飞的又高又远");
    }
}
