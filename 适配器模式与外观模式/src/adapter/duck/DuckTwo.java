package adapter.duck;

/**
 * Created by Administrator on 2016/8/4 0004.
 */
public class DuckTwo implements Duck {
    @Override
    public void quack() {
        System.out.println("第二种叫声模式：呱呱");
    }

    @Override
    public void fly() {
        System.out.println("第二种飞行模式：飞的又低又近");
    }
}
