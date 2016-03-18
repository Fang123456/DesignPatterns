package duck;

import FlyBehavior.FlyBehaviorImpl.FlyWithWings;
import QuackBehavior.QuackBehaviorImpl.Quack;

/**
 * Created by AAAAA on 2016/3/2.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
